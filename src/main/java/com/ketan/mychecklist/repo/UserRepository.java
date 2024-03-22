package com.ketan.mychecklist.repo;

import com.ketan.mychecklist.entity.MclUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MclUser, String> {
}
