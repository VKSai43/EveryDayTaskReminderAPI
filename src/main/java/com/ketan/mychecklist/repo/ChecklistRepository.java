package com.ketan.mychecklist.repo;

import com.ketan.mychecklist.entity.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChecklistRepository extends JpaRepository<Checklist,String> {

    List<Checklist> findByUserId(String userId);
}
