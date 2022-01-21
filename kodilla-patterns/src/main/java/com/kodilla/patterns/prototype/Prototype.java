package com.kodilla.patterns.prototype;

public class Prototype<Board> implements Cloneable {

    @Override
    public Board clone() throws CloneNotSupportedException {
        return (Board)super.clone();
    }
}
