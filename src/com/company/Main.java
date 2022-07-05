package com.company;

public class Main {

    public static void main(String[] args) {
        StudyAble study = (a, b) -> System.out.println(a.toUpperCase() + " " + b.toUpperCase());

        study.word1("This is a", "Java");

    }
}

