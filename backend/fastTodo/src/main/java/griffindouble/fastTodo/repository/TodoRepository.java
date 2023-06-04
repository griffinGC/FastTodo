package griffindouble.fastTodo.repository;

import griffindouble.fastTodo.domain.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Todo todo){
        em.persist(todo);
    }

    public Todo findOne(Long id){
        return em.find(Todo.class, id);
    }
}
