import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        int choice1;
        int choice2;
        double amount;
        double meter, mile, yard;
        double kilogram, lb, ounce;

        Scanner sc = new Scanner(System.in);

        System.out.println("Conversion type:");
        System.out.println("Enter 1: weight");
        System.out.println("Enter 2: distance");

        System.out.println("Choose what you want to convert: ");
        choice1 = sc.nextInt();
        System.out.println("Your number is: " + choice1);

        System.out.println("Options:");
        if (choice1 == 1) {
            System.out.println("Enter 1: kilogram");
            System.out.println("Enter 2: lb");
            System.out.println("Enter 3: ounce");
        }else if(choice1 == 2){
            System.out.println("Enter 1: meter");
            System.out.println("Enter 2: mile");
            System.out.println("Enter 3: yard");
        }else{
            System.out.println("Invalid input");
        }

        System.out.println("Choose your option: ");
        choice2 = sc.nextInt();
        System.out.println("Your number is: " + choice2);

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();
        System.out.println("Your amount is: " + amount);
        if (choice1 == 1) {
            switch (choice2) {
                case 1: // Conversion from kilograms
                    lb = amount * 2.20;
                    System.out.println(amount + " kilogram = " + lb + " lb");
                    ounce = amount * 35.27;
                    System.out.println(amount + " kilogram = " + ounce + " ounce");
                    break;

                case 2: // Conversion from lb
                    kilogram = amount * 0.45;
                    System.out.println(amount + " lb = " + kilogram + " kilogram");
                    ounce = amount * 16.00;
                    System.out.println(amount + " lb = " + ounce + " ounce");
                    break;

                case 3: // Conversion from ounce
                    kilogram = amount * 0.03;
                    System.out.println(amount + " ounce = " + kilogram + " kilogram");
                    lb = amount * 0.06;
                    System.out.println(amount + " ounce = " + lb + " lb");
                    break;

                // Default case
                default:
                    System.out.println("Invalid input");
            }
        }else if(choice1 == 2) {
            switch (choice2) {
                case 1: // Conversion from meters
                    mile = amount * 3.28;
                    System.out.println(amount + " meter = " + mile + " mile");
                    yard = amount * 1.09;
                    System.out.println(amount + " meter = " + yard + " yard");
                    break;

                case 2: // Conversion from miles
                    meter = amount * 1609.34;
                    System.out.println(amount + " mile = " + meter + " meter");
                    yard = amount * 1760.00;
                    System.out.println(amount + " mile = " + yard + " yard");
                    break;

                case 3: // Conversion from yards
                    meter = amount * 0.91;
                    System.out.println(amount + " yard = " + meter + " meter");
                    mile = amount * 0.00057;
                    System.out.println(amount + " yard = " + mile + " mile");
                    break;

                // Default case
                default:
                    System.out.println("Invalid input");
            }
        }else{
            System.out.println("Invalid input");
        }
    }
}
