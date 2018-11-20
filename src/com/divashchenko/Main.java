package com.divashchenko;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> allObjects = new ArrayList<>();

        Object object1 = new Object(10, 5);
        Object object2 = new Object(20, 29);
        Object object3 = new Object(5, 8);
        Object object4 = new Object(7, 12);
        Object object5 = new Object(12, 16);
        Object object6 = new Object(2, 8);
        Object object7 = new Object(24, 1);
        Object object8 = new Object(4, 10);
        Object object9 = new Object(2, 9);

        allObjects.add(object1);
        allObjects.add(object2);
        allObjects.add(object3);
        allObjects.add(object4);
        allObjects.add(object5);
        allObjects.add(object6);
        allObjects.add(object7);
        allObjects.add(object8);
        allObjects.add(object9);

        Backpack backpack = new Backpack(17);

        System.out.println("All objects: " + allObjects);
        System.out.println();
        Sorter.sort(backpack, allObjects);
    }
}
