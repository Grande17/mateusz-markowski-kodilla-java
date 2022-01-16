package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard(){
        return new Board(getToDo(),getInProgress(),getDone());
    }
    public TaskList getToDo(){
        return new TaskList();
    }
    public TaskList getInProgress(){
        return new TaskList();
    }
    public TaskList getDone(){
        return new TaskList();
    }
}
