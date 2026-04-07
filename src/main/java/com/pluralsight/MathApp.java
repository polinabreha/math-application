package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
       // Question 1 what is the highest salary
        int bobSalary = 3400;
        int garySalary = 5600;
        int highestSalary;
        highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        // smallest of two variables named carPrice and truckPrice.

        int carPrice = 24000;
        int truckPrice = 100000;
        int smallestPrice;
        smallestPrice = Math.min(carPrice,truckPrice);
        System.out.println("The smallest price is: " + smallestPrice);

        //Find and display the area of a circle whose radius is 7.25

        double radius = 7.25;
        double area = Math.PI * (radius * radius);
        double roundArea = Math.round(area);
        System.out.println("The area is: " + roundArea+ " with radius " + radius);

        //Find and display the square root a variable after it is set to 5.0
        double variableAfterRoot = 5.0;
        double variableBeforeRoot = variableAfterRoot*variableAfterRoot;
        System.out.println("The variable before root is: " + variableBeforeRoot);

        //Find and display the distance between the points (5, 10) and (85, 50)
        double x1 = 5.0;
        double y1 = 10.0;
        double x2 = 85.0;
        double y2 = 50.0;

        double distance = Math.hypot(x2 - x1, y2 - y1);
        double roundDistance = Math.round(distance);
        System.out.println("The distance is: " + roundDistance);

        //Find and display the absolute (positive) value of a variable after it is set to -3.8

        double negativeNumber = -3.8;
        double positiveNumber = Math.abs(negativeNumber);
        System.out.println("The positive number is: " + positiveNumber);

        //Find and display a random number between 0 and 1

         double randomNumber = Math.random();
         System.out.println("The random number is: " + randomNumber);

         //Calculate how many minutes are in 24 days, use a variable for each value you
        //calculate with.

        int numberOfDays = 24;
        int numberHoursInDay = 24;
        int numberOfMinutesInHour = 60;
        int numberOfMinutesInDay = numberHoursInDay*numberOfMinutesInHour;
        System.out.println("The number of minutes in " + numberOfDays + " days is: " + numberOfMinutesInDay*numberOfDays);







    }
}
