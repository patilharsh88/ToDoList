package com.ToDoList.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ToDoList.Entity.Task;
import com.ToDoList.Repo.TaskJPA;

@Component
public class TaskDAO {

    @Autowired
    TaskJPA tjpa;

    public Task saveTask(Task t) {
        return tjpa.save(t);
    }

    public List<Task> getAllTasks() {
        return tjpa.findAll();
    }

    public void deleteTask(int id) {
        tjpa.deleteById(id);
    }
}
