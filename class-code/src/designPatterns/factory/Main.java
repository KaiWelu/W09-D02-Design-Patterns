package designPatterns.factory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CircleFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();

        System.out.println(circle.getClass().getSimpleName());

    }
}
