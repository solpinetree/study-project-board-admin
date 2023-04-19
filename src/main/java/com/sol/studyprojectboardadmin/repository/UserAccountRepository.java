package com.sol.studyprojectboardadmin.repository;

import com.sol.studyprojectboardadmin.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
