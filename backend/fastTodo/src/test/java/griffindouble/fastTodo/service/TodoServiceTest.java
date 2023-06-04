package griffindouble.fastTodo.service;

import griffindouble.fastTodo.domain.Todo;
import griffindouble.fastTodo.repository.TodoRepository;
import jakarta.persistence.EntityManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TodoServiceTest {
    @Autowired
    TodoRepository todoRepository;

    @Autowired
    TodoService todoService;

    @Autowired
    EntityManager em;

    @Test
    @Rollback(value = false)
    public void Todo생성() throws Exception{
        Todo todo = new Todo();
        todo.setTodoContents("생성 테스트 입니다~");

        Long id = todoService.saveTodo(todo);

        assertEquals(todo, todoRepository.findOne(id));
        System.out.println("test the end!");

    }


}