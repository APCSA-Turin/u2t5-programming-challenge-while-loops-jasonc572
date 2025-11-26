package com.example.project;


public class WhileLoopsRunner{

    public static void main(String[] args) {
        WhileLoops test = new WhileLoops();
        System.out.println(test.weeksToReachGoal(0, 50, 200));
        System.out.println(test.weeksToReachGoal(100, 20, 110));
        System.out.println(test.weeksToReachGoal(500, 100, 400));
        System.out.println(test.weeksToReachGoal(0, 50, 200));
        System.out.println(test.weeksToReachGoal(10, 10, 40));
    }
}