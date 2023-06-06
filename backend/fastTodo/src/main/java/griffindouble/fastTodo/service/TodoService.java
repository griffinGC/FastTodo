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


    // requiredArgsConstructor를 이용해서 final 키워드를 가진 변수에 대해서 DI 수행
    private final TodoRepository todoRepository;

    // todo 추가
    @Transactional
    public Long saveTodo(Todo todo){
        todoRepository.save(todo);
        return todo.getId();
    }

    // todo 불러오기
    @Transactional
    public Todo getTodo(Long id){
        Todo todo = todoRepository.findOne(id);
        return todo;
    }

}
