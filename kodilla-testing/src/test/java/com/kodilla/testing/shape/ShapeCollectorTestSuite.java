package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@Nested
@DisplayName("Shape Collector Test")
public class ShapeCollectorTestSuite {

    @Test
    void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle", 6);
        ///When
        shapeCollector.addFigure(shape);
        //Then
        Assertions.assertEquals(1,shapeCollector.getShapes().size());

    }
    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle", 6);
        shapeCollector.addFigure(shape);
        //When
        shapeCollector.removeFigure(shape);
        //Then
        Assertions.assertEquals(0,shapeCollector.getShapes().size());
    }
    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle", 6);
        shapeCollector.addFigure(shape);
        //When
        Shape figure = shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(figure,shape);

    }
    @Test
    void testShowFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle", 6);
        shapeCollector.addFigure(shape);
        List<Shape>list = new ArrayList<>();
        list.add(shape);
        //When
        List<Shape> resultList = shapeCollector.getShapes();
        //Then
        Assertions.assertEquals(list.toString(), resultList.toString());


    }


}
