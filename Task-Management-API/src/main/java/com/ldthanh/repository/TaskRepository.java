package com.ldthanh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldthanh.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
