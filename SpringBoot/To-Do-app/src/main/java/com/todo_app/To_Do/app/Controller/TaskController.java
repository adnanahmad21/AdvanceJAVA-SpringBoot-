package com.todo_app.To_Do.app.Controller;

import org.springframework.ui.Model;
import com.todo_app.To_Do.app.Model.Task;
import com.todo_app.To_Do.app.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public String getTask(Model model)
    {
        List<Task> list=taskService.getAllTasks();
        model.addAttribute("tasks",list);
        return  "tasks";
    }
    @PostMapping
    public String createTask(@RequestBody String title)
    {
        taskService.addTask(title);
        return "redirect:/";
    }

    @GetMapping("{id}/delete")
    public  String deleteTask(@PathVariable Long id)
    {
        taskService.deleteTaskbyId(id);
        return "redirect:/";
    }
    @GetMapping("{id}/toggle")
    public  String toggleTask(@PathVariable Long id)
    {
        taskService.toggleTaskbyId(id);
        return "redirect:/";
    }

}
