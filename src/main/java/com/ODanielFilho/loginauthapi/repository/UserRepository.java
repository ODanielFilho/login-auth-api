package com.ODanielFilho.loginauthapi.repository;

import com.ODanielFilho.loginauthapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
