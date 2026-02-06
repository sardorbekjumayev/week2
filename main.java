import java.util.Scanner;
import java.util.Random;

public class week2 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //problem1
/*
        double cappuccino = 4.50;
        double muffins = 3.00;



        System.out.print("Please Enter Cappuccinos number: ");
        int capNum = input.nextInt();

        System.out.print("Please Enter Muffins number: ");
        int mufNum = input.nextInt();

        double subtotal = capNum*cappuccino + mufNum*muffins;
        double total = subtotal + subtotal*8/100 + 5;

        System.out.print("Grand Total: $"+total);
 */


        //problem2
/*
        double RoadLenght = 570;
        double TotalLitre = 0, TotalCost = 0;

        TotalLitre = RoadLenght/100*8.5;
        TotalCost = TotalLitre*12500;

        System.out.print("Distance: " + RoadLenght);
        System.out.print("Fuel Needed: " + TotalLitre);
        System.out.print("TotalCost: " + TotalCost);
 */


        //problem3

        /*
        System.out.print("Enter time in seconds");
        int totalSeconds  = input.nextInt();


        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("Time is: %02d Hours, %02d minutes, %02d% seconds", hours, minutes, seconds);

         */


        //problem4

        /*
        System.out.print("Enter your age: ");
        int userAge = input.nextInt();

        if (userAge >= 0 & userAge <= 12)
            System.out.print("Ticket Price: $7");
        else if (userAge >= 13 & userAge <= 17)
            System.out.print("Ticket Price: $10");
        else if (userAge >= 18 & userAge <= 64)
            System.out.print("Ticket Price: $15");
        else if (userAge >=65)
            System.out.print("Ticket Price: $10");

         */


        //problem5

        /*
        System.out.print("Enter year: ");
        int yearNum = input.nextInt();

        if (yearNum % 4 == 0 & yearNum % 100 == 0)
            System.out.print("Not a Leap Year");
        else if (yearNum % 4 == 0 & yearNum % 100 != 0)
            System.out.print("Leap Year");
         */


        //problem6

/*
        System.out.print("Enter kg of package: ");
        double weight = input.nextDouble();
        double rem = 0, remCost = 0;

        if (weight >=0 & weight <= 2){
            System.out.print("Shipping Cost: $5.00");
        } else if (weight >=3 &  weight <= 10) {
            System.out.print("Shipping Cost: $10.00");
        } else if (weight > 10) {
            rem = weight - 10.00;
            remCost = rem*2.00;
            System.out.print("Shipping Cost: $"+ (10.00 + remCost));
        }


 */


        //problem7

        /*
        int correctPIN = 0, attempts = 0;

        System.out.print("Set New PIN: ");
        int newpin = input.nextInt();
        correctPIN = newpin;

        System.out.print("\nSuccessfully");

        while(attempts <3){
            System.out.print("\nenter Your card PIN:");
            int pin = input.nextInt();

            if (pin == correctPIN){
                System.out.print("\nAccess Granted");
                break;
            }else {
                System.out.print("\nTry again");
                attempts+=1;
            }
        }

        if (attempts == 3)
            System.out.print("\nAccount Locks");
         */


        //problem8
/*
        int year = 0;
        double population = 100000;

        while (population < 200000) {
            year++;
            population = population * 1.05;

            System.out.println("Year " + year + ": " + (int)population);
        }

        System.out.println("It will take " + year + " years to double.");


 */

        
        //problem9
/*

        for (int i = 0; i < 50; i++) {

            int randNum = (int) (Math.random() * 51);
            System.out.print("\nRand num "+randNum);

            if (randNum % 3 == 0)
                System.out.print("Fizz");
            if (randNum % 5 == 0)
                System.out.print("Buzz");

        }


 */

        //problem10

        /*
        System.out.print("Enter Years");
        double deposit = 1000;
        double yearsNum = input.nextDouble();

        for (int i = 0; i < yearsNum; i++) {

            double NewBalance = deposit + (deposit*0.05);
            deposit = NewBalance;

            System.out.print("\nYear "+ i + ": $" + NewBalance);
        }
         */

    }

}
