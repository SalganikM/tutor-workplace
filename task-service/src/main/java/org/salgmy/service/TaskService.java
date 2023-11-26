package org.salgmy.service;

import lombok.RequiredArgsConstructor;
import org.salgmy.dao.repository.TaskRepository;
import org.salgmy.domain.TaskDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository repository;

    public List<TaskDTO> getAllTasks() {
        return repository.findAll();
    }
}
