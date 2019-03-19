package com.goaleaf.repositories;

import com.goaleaf.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>, PagingAndSortingRepository<User, Integer> {

    User findById(Integer Id);

    @Query("select count(*) from User p where p.id = ?1")
    Integer checkIfExists(Integer id);
}