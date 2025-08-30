package com.springsecurityDB.RoleBaseAuth2.repository;

import com.springsecurityDB.RoleBaseAuth2.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserDetail, Integer> {
    Optional<UserDetail> findByEmail(String email);
}
