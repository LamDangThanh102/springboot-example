package com.ldthanh.service;

import java.util.List;
import java.util.Optional;

import com.ldthanh.dto.TaskDTO;
import com.ldthanh.entity.Task;

public interface TaskService {
	Optional<Task> getTaskById(Long id);
	
	List<Task> getAllTasks();
	
	Task createTask(TaskDTO task);
	
	Optional<Task> updateTask(Long id, TaskDTO task);
	
	Optional<Task> updateTaskStatus(Long id);
	
	boolean deleteTask(Long id);
}
