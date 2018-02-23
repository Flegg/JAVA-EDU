package com.shildt.beginners.tasks.chapter1;

public class InchToMeter {

    private static final double INCHES_IN_ONE_METER = 39.37;

    public static void main(String[] args) {

        int counter = 0, inch;
        double meter;

        for (inch = 1; inch <= 144; inch++) {
            meter = inch / INCHES_IN_ONE_METER;

            if (inch >= 5 && inch <= 20) {
                System.out.println(inch + " дюймов равны " + meter + " метрам");
                counter++;
            }

            else if (inch % 10 >= 2 && inch % 10 <= 4) {
                System.out.println(inch + " дюйма равны " + meter + " метрам");
                counter++;
            }

            else if (inch % 10 >= 5 && inch % 10 <= 9 || inch % 10 == 0) {
                System.out.println(inch + " дюймов равны " + meter + " метрам");
                counter++;
            }

            else if (inch % 10 == 1) {
                System.out.println(inch + " дюйм равен " + meter + " метрам");
                counter++;
            }

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }

        }
    }

}
