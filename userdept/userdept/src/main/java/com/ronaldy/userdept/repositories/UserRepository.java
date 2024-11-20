package com.ronaldy.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronaldy.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
