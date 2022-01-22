package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "Driving Task";
    public static final String PAINTING = "Painting Task";
    public static final String SHOPPING = "Shopping Task";

    public final Task makeTask(final String taskType){
        switch(taskType){
            case DRIVING:
                return new DrivingTask("JohnSmith","Airport","Car");
            case PAINTING:
                return new PaintingTask("Help", "Whthe", "Walls");
            case SHOPPING:
                return new ShoppingTask("Grocery","Bread", 3);
            default:
                return null;
        }
    }
}
