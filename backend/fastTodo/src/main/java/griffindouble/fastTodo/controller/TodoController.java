package griffindouble.fastTodo.controller;

import griffindouble.fastTodo.domain.Todo;
import griffindouble.fastTodo.dto.TodoDto;
import griffindouble.fastTodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/createTodo")
    public Todo createTodo(@RequestBody TodoDto todo) {
        Todo newTodo = null;
        Todo savedTodo = null;
        try {
            System.out.println("project : " + todo.getProject());
            newTodo = todo.toEntity(todo.getProject(), todo.getTodoContents(), todo.getUser());

            Long aLong = todoService.saveTodo(newTodo);

            savedTodo = todoService.getTodo(aLong);

        } catch(Exception e){
            System.out.println("createTodo error : " + e);
        }
        return savedTodo;
    }

}
