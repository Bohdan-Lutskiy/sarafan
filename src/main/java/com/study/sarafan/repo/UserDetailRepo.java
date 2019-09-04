package com.study.sarafan.repo;

import com.study.sarafan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepo extends JpaRepository<User, String> {
}
