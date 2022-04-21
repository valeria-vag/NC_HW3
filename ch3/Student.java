package com.netcracker.ch3;

public class Student {
    private String name;
    private double totalScore;
    private int countQuiz;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addQuiz(int score) {
        totalScore += score;
        countQuiz++;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        return totalScore / countQuiz;
    }

}
