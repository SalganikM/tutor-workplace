package org.salgmy.controller;

import org.salgmy.domain.TaskDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "task")
public class TaskController {

    @GetMapping
    public List<TaskDTO> getAllTasks() {

    }
}
