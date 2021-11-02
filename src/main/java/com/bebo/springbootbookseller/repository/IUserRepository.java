package com.bebo.springbootbookseller.repository;

import com.bebo.springbootbookseller.model.Role;
import com.bebo.springbootbookseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    @Modifying //result of this query will change the database table
    @Query("UPDATE User SET role = :role WHERE username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);

}
