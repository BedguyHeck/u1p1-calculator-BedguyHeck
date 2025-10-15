package com.example;

import java.util.Scanner;

public class TipCalculator {
    // Main tip calculation method
    public static String calculateTip(int people, int percent, double cost) {
        double tipAmount = cost * percent / 100.0;
        double totalWithTip = cost + tipAmount;
        double perPersonBeforeTip = cost / people;
        double tipPerPerson = tipAmount / people;
        double totalPerPerson = totalWithTip / people;

        // Round all values to nearest hundredth
        tipAmount = Math.round(tipAmount * 100.0) / 100.0;
        totalWithTip = Math.round(totalWithTip * 100.0) / 100.0;
        perPersonBeforeTip = Math.round(perPersonBeforeTip * 100.0) / 100.0;
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
        totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tipAmount + "\n" +
                       "Total Bill with tip: $" + totalWithTip + "\n" +
                       "Per person cost before tip: $" + perPersonBeforeTip + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    // Extra credit method using a loop (placeholder loop for demo)
    public static String extraCredit(int people, int percent, double cost) {
        String result = "";
        boolean condition = true;

        while (condition) {
            double tipAmount = cost * percent / 100.0;
            double totalWithTip = cost + tipAmount;
            double perPersonBeforeTip = cost / people;
            double tipPerPerson = tipAmount / people;
            double totalPerPerson = totalWithTip / people;

            // Round all values to nearest hundredth
            tipAmount = Math.round(tipAmount * 100.0) / 100.0;
            totalWithTip = Math.round(totalWithTip * 100.0) / 100.0;
            perPersonBeforeTip = Math.round(perPersonBeforeTip * 100.0) / 100.0;
            tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
            totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;

            result = "-------------------------------\n" +
                    "Total bill before tip: $" + cost + "\n" +
                    "Total percentage: " + percent + "%\n" +
                    "Total tip: $" + tipAmount + "\n" +
                    "Total Bill with tip: $" + totalWithTip + "\n" +
                    "Per person cost before tip: $" + perPersonBeforeTip + "\n" +
                    "Tip per person: $" + tipPerPerson + "\n" +
                    "Total cost per person: $" + totalPerPerson + "\n" +
                    "-------------------------------\n";

            condition = false;  // exit loop after one run
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        int people = 10;
        int percent = 8;
        double cost = 10.5;

        // Test standard method
        System.out.println(calculateTip(people, percent, cost));

        // Test extra credit
        System.out.println(extraCredit(people, percent, cost));
    }
}
