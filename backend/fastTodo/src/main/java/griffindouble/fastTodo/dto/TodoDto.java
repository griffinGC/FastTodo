package griffindouble.fastTodo.dto;

import griffindouble.fastTodo.domain.Todo;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {

    public String project;
    public String todoContents;
    public String user;
    public LocalDateTime inputDate;
    public LocalDateTime updateDate;

    public Todo toEntity(String project, String todoContents, String user){
        Todo todo = Todo.builder()
                .project(project)
                .todoContents(todoContents)
                .user(user)
                .inputDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        return todo;
    }

}
