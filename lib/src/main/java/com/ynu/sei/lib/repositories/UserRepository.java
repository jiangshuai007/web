package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT u FROM User u where u.phoneNumber = :phoneNumber")
    User getByPhoneNumber(@Param("phoneNumber") String phoneNumber);

    @Query("SELECT u FROM User u where u.name = :name")
    User getByName(@Param("name") String name);
}
