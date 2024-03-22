package com.ketan.mychecklist.repo;

import com.ketan.mychecklist.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, String>{
}
