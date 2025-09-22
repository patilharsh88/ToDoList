package com.ToDoList.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ToDoList.Entity.Task;
import com.ToDoList.Service.TaskService;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:5173")  // Allow React frontend
public class TaskController {

    @Autowired
    TaskService tservice;

    @GetMapping("/ping")
    public String ping() {
        return "Backend is running ✅";
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return tservice.getAllTasks();
    }

    @PostMapping
    public Task saveTask(@RequestBody Task t) {
        return tservice.saveTask(t);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        tservice.deleteTask(id);
        return "Task deleted successfully!";
    }
}
