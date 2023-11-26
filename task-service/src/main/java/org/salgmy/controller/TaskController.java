package org.salgmy.controller;

import lombok.RequiredArgsConstructor;
import org.salgmy.domain.TaskDTO;
import org.salgmy.service.impl.TaskServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskServiceImpl service;

    @GetMapping
    public List<TaskDTO> getAllTasks() {
        return service.getAllTasks();
    }
}
