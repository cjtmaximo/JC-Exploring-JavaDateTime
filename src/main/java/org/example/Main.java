package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

        // Exercise 3 - LocalDateTime and DateTimeFormatter
        LocalDateTime event = LocalDateTime.of(2025, 11, 27, 19, 0, 0);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        System.out.println("Default format: " + event);
        System.out.println("Custom format: " + event.format(dtf5));

        // Exercise 4 - The Immutability of Date-Time Objects
        LocalDate startDate = LocalDate.of(2025, 9, 1);

        // Attempt to add 10 days, but don't assign the result
        startDate.plusDays(10);

        System.out.println("Start date after trying to modify it: " + startDate); // Doesn't work because Date-Time objects are immutable

        // Now correctly add 10 days by assigning the result to a new variable
        LocalDate endDate = startDate.plusDays(10);

        System.out.println("The original start date is still: " + startDate);
        System.out.println("The new end date is: " + endDate);
    }
}