package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDo;
    private TaskList inProgress;
    private TaskList doneList;

    public Board(TaskList toDo, TaskList inProgress, TaskList doneList) {
        this.toDo = toDo;
        this.inProgress = inProgress;
        this.doneList = doneList;
    }

    public TaskList getToDo() {
        return toDo;
    }

    public TaskList getInProgress() {
        return inProgress;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
