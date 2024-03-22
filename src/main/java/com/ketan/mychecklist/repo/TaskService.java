package com.ketan.mychecklist.repo;

import com.ketan.mychecklist.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public Task createTask(Task task){

        return taskRepository.save(task);
    }
}
