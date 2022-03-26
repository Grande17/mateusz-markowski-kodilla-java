package com.kodilla.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    void testUpdateMentor(){
        //Given
        Student adamBen = new Student("Adam Ben", Course.JAVA_COURSE);
        Student tomHak = new Student("Tomasz Hak",Course.JAVA_COURSE);
        Student annBak = new Student("Anna Bak",Course.PYTHON_COURSE);

        Mentor mentor1 = new Mentor("Jakub Wolny");
        Mentor mentor2 = new Mentor("Bartosz Szybki");

        adamBen.registerObserver(mentor1);
        tomHak.registerObserver(mentor1);
        annBak.registerObserver(mentor2);
        //When
        adamBen.addHomework("Homework: Hello World!");
        adamBen.addHomework("Homework: OOP Programing");
        tomHak.addHomework("Homework: Streams");
        tomHak.addHomework(("Homework: MySQL"));
        annBak.addHomework("Homework: First Task");
        //Then
        assertEquals(2,adamBen.getHomework().size());
        assertEquals(2,tomHak.getHomework().size());
        assertEquals(1,annBak.getHomework().size());
    }

}
