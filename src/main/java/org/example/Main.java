package org.example;

import tasks.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Response> tasks = new ArrayList<>();
        Task1 task1 = new Task1();
        tasks.add(task1);
        Task2 task2 = new Task2();
        tasks.add(task2);
        Task3 task3 = new Task3();
        tasks.add(task3);
        Task4 task4 = new Task4();
        tasks.add(task4);
        Task5 task5 = new Task5();
        tasks.add(task5);
        Task6 task6 = new Task6();
        tasks.add(task6);
        Task7 task7 = new Task7();
        tasks.add(task7);
        Task8 task8 = new Task8();
        tasks.add(task8);
        tasks.forEach(Response::getResponse);
    }
}