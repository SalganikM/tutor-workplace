package org.salgmy.service.api;

import org.salgmy.domain.TaskDTO;

import java.util.List;

public interface TaskService {
    public List<TaskDTO> getAllTasks();
}
