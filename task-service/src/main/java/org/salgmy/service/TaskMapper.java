package org.salgmy.service;

import org.mapstruct.Mapper;
import org.salgmy.dao.entity.Task;
import org.salgmy.domain.TaskDTO;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class TaskMapper {
    public abstract TaskDTO map(Task task);

    public abstract List<TaskDTO> map(List<Task> tasks);
}
