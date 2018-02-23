package com.shildt.beginners.tasks.chapter1;

public class InchToMeter {

    private static final double INCHES_IN_ONE_METER = 39.37;

    public static void main(String[] args) {

        int counter = 0, inch;
        double meter;

        for (inch = 1; inch <= 144; inch++) {
            meter = inch / INCHES_IN_ONE_METER;

            System.out.println(inch + " дюйм равен " + meter + " метрам");
            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }

        }
    }

}
