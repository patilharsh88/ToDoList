package com.ToDoList.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ToDoList.DAO.TaskDAO;
import com.ToDoList.Entity.Task;

@Service
public class TaskService {
    
    @Autowired
    TaskDAO tdao;
    
    public Task saveTask(Task t) {
        return tdao.saveTask(t);
    }

    public List<Task> getAllTasks() {
        return tdao.getAllTasks();
    }

    public void deleteTask(int id) {
        tdao.deleteTask(id);
    }

	
}
