package org.salgmy.service.impl;

import lombok.RequiredArgsConstructor;
import org.salgmy.dao.repository.TaskRepository;
import org.salgmy.domain.TaskDTO;
import org.salgmy.service.TaskMapper;
import org.salgmy.service.api.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository repository;
    private final TaskMapper mapper;

    public List<TaskDTO> getAllTasks() {
        return mapper.map(repository.findAll());
    }
}
