package griffindouble.fastTodo.service;

import griffindouble.fastTodo.domain.Todo;
import griffindouble.fastTodo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TodoService {


    // 생성자를 이용한 주입방식 사용
    private final TodoRepository todoRepository;

    // todo 추가
    @Transactional
    public Long saveTodo(Todo todo){
        todoRepository.save(todo);
        return todo.getId();
    }

    // todo 불러오기

}
