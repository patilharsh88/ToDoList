package com.ToDoList.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ToDoList.Entity.Task;

@Repository
public interface TaskJPA extends JpaRepository<Task, Integer> {
	
	
}