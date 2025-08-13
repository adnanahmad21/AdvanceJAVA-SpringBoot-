package com.todo_app.To_Do.app.Service;

import com.todo_app.To_Do.app.Model.Task;
import com.todo_app.To_Do.app.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;
    public List<Task> getAllTasks() {
        List<Task> list= taskRepository.findAll();
        return list;
    }

    public void addTask(String title) {
    Task task=new Task();
    task.setTitle(title);
    task.setCompleted(false);
    taskRepository.save(task);
    }

    public void deleteTaskbyId(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTaskbyId(Long id) {
      Task task=taskRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("invalid id"));
 task.setCompleted(!task.isCompleted());
 taskRepository.save(task);
    }
}
