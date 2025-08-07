package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Exercise 1 - LocalDate and DateTimeFormatter
        LocalDate today = LocalDate.of(2025, 8, 21);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        System.out.println("Default format: " + today);
        System.out.println("Custom format 1: " + today.format(dtf1));
        System.out.println("Custom format 2: " + today.format(dtf2));

        // Exercise 2 - LocalTime and DateTimeFormatter
        LocalTime now = LocalTime.of(16, 45, 30);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println("Default format: " + now);
        System.out.println("24-hour format: " + now.format(dtf3));
        System.out.println("12-hour format: " + now.format(dtf4));
    }
}