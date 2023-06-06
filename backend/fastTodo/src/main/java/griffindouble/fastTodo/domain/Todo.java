package griffindouble.fastTodo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Builder
public class Todo {

    @Id @GeneratedValue
    @Column(name= "todo_id")
    private Long id;

    // 나중에 project 라는 테이블 만들어서 프로젝트별로 Todo관리하도록 만들 예정
    private String project;

    // 내용
    private String todoContents;

//    private User user;
    private String user;

    private LocalDateTime inputDate;

    private LocalDateTime updateDate;
}
