package com.todo_app.To_Do.app.Repository;

import com.todo_app.To_Do.app.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository  extends JpaRepository<Task,Long > {
}
