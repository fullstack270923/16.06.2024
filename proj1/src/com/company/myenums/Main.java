package com.company.myenums;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        //Days.low.equals("Low");
        Days freeDay = Days.FRIDAY;
        if (freeDay == Days.MONDAY) {
            System.out.println("you live in USA");
        }
        System.out.println(freeDay);

        Days day = Days.SUNDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Start the week with a meeting.");
                break;
            case FRIDAY:
                System.out.println("Wrap up the week and prepare for the weekend.");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Enjoy the weekend!");
                break;
            default:
                System.out.println("Another day, another task.");
                break;
        }
        Days friday = Days.valueOf("FRIDAY");
        System.out.println(friday);

        Arrays.stream(Days.values()).forEach(System.out::println);
    }

}
