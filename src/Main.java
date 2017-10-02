import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Exercise 1
        System.out.println("Exercise 1");
        System.out.println("Hello World");
        System.out.println();

        //Exercise 2
        Scanner scnr = new Scanner(System.in);
        System.out.println("Exercise 2");
        System.out.println("Please enter a number");
        int userNum = scnr.nextInt();
        int result = userNum + 1;
        System.out.println(result);
        scnr.nextLine();
        System.out.println();

        //Exercise 3
        System.out.println("Exercise 3");
        System.out.println("Please enter a number");
        double userNum2 = scnr.nextDouble();
        double result2 = userNum2 + 0.5;
        System.out.println(result2);
        scnr.nextLine();
        System.out.println();

        //Exercise 4
        System.out.println("Exercise 4");
        System.out.println("Enter a number");
        double userNum3 = scnr.nextDouble();
        System.out.println("Enter a second number");
        double userNum4 = scnr.nextDouble();
        double resultSum = userNum3 + userNum4;
        System.out.println(resultSum);
        scnr.nextLine();
        System.out.println();

        //Exercise 5
        System.out.println("Exercise 5");
        System.out.println("Enter a number");
        double prod = scnr.nextDouble();
        System.out.println("Enter another number");
        double prod2 = scnr.nextDouble();
        double resultProd = prod * prod2;
        double roundOff = Math.round(resultProd * 100.0) / 100.0;
        System.out.println(roundOff);
        scnr.nextLine();
        System.out.println();

        //Exercise 6
        String choice;
        System.out.println("Exercise 6");
        do {
            System.out.println("Hello World");
            System.out.println("Would you like to continue? Y/N:");
            choice = scnr.nextLine();
        } while (choice.equals("Y") || choice.equals("y"));
        System.out.println();

        //Exercise 9
        System.out.println("Exercise 9");
        System.out.println("Please choose a language: 1. French 2. English 3. Spanish");
        int number = scnr.nextInt();

        switch (number) {
            case 1:
                System.out.println("bonjour le monde");
                break;
            case 2:
                System.out.println("hello world");
                break;
            case 3:
                System.out.println("hola mundo");
                break;
            default:
                System.out.println("Whoops");
        }
        scnr.nextLine();
        System.out.println();

        //Exercise 10
        System.out.println("Exercise 10");
        System.out.println("Please enter your height in inches");
        int inches = scnr.nextInt();
        if (inches < 54) {
            System.out.println("not tall enough to ride this raptor");
        } else System.out.println("enjoy the ride");
        scnr.nextLine();
        System.out.println();

        //Exercise 11
        System.out.println("Exercise 11");
        String cont11;
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            System.out.println("Continue? Y/N");
            cont11 = scnr.nextLine();
        }
        while (cont11.equals("Y") || cont11.equals("y"));
        System.out.println();

        //Exercise 12
        String cont12;
        System.out.println("Exercise 12");
        do {
            for (int i = 9; i >= 0; i--) {
                System.out.println(i);
            }
            System.out.println("Continue? Y/N");
            cont12 = scnr.nextLine();
        }
        while (cont12.equals("Y") || cont12.equals("y"));
        System.out.println();

        //Exercise 13
        System.out.println("Exercise 13");
        String cont3;
        do {
            System.out.println("Please enter a number");

            int num = scnr.nextInt();
            scnr.nextLine();
            for (int i = num; i >= 0; i--) {
                System.out.println(i);
            }
            System.out.println("Continue? Y/N");
            cont3 = scnr.nextLine();
        } while (cont3.equals("Y") || cont3.equals("y"));
        System.out.println();

        //Exercise 14
        System.out.println("Exercise 14");
        String cont4;
        do {
            System.out.println("Please enter a number");
            int num = scnr.nextInt();
            scnr.nextLine();
            for (int i = 1; i <= num; i++) {
                int square = i * i;
                System.out.println(square);
            }
            System.out.println("Continue? Y/N");
            cont4 = scnr.nextLine();
        } while (cont4.equals("Y") || cont4.equals("y"));
        System.out.println();

        //Exercise 15
        System.out.println("Exercise 15");
        String cont15;
        do {
            System.out.println("Please enter a number");
            int num2 = scnr.nextInt();
            scnr.nextLine();
            for (int i = 1; i <= num2; i++) {
                int cube = i * i * i;
                System.out.println(cube);
            }
            System.out.println("Continue? Y/N");
            cont15 = scnr.nextLine();
        } while (cont15.equals("Y") || cont15.equals("y"));
        System.out.println();

        //Exercise 16
        System.out.println("Exercise 16");
        for (int i = 0; i <= 10; i++) {
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();

        //Exercise 18
        System.out.println("Exercise 18");
        String cont18;
        do {
            System.out.println("Enter a number:");
            int numberChoice = scnr.nextInt();
            scnr.nextLine();
            int sum = 0;
            for (int i = 1; i <= numberChoice; i++) {
                sum = i + sum;
            }
            System.out.println(sum);
            System.out.println("Continue? Y/N");
            cont18 = scnr.nextLine();
        } while (cont18.equals("Y") || cont18.equals("y"));
        System.out.println();

        //Exercise 19
        System.out.println("Exercise 19");
        String cont19;
        do {
            System.out.println("Enter a number:");
            int numberChoice = scnr.nextInt();
            System.out.println("Enter a second number");
            int numberTwo = scnr.nextInt();
            scnr.nextLine();
            int sum = 0;
            for (int i = numberChoice; i <= numberTwo; i++) {
                sum = i + sum;
            }
            System.out.println(sum);
            System.out.println("Continue? Y/N");
            cont19 = scnr.nextLine();
        } while (cont19.equals("Y") || cont19.equals("y"));
        System.out.println();

        //Exercise 20
        //Option 1
        System.out.println("Exercise 20 - Option 1");
        String cont20;
        do {
            System.out.println("Enter a number:");
            int numberChoice = scnr.nextInt();
            scnr.nextLine();
            int product;
            int secondNum = numberChoice - 1;
            int thirdNum = numberChoice - 2;
            product = numberChoice * secondNum * thirdNum;
            System.out.println(product);
            System.out.println("Continue? Y/N");
            cont20 = scnr.nextLine();
        } while (cont20.equals("Y") || cont20.equals("y"));
        System.out.println();

        //Option 2
        System.out.println("Exercise 20 - Option 2");
        String cont202;
        do {
            System.out.println("Enter a number:");
            int numberChoice = scnr.nextInt();
            scnr.nextLine();
            int product2 = 0;
            int newProd = 0;
            for (int i = numberChoice; i > numberChoice - 2; i--) {
                product2 = numberChoice * i;
                for (int j = product2; j > i - 2; j--) {
                    newProd = product2 * j;
                }
            }
            System.out.println(newProd);
            System.out.println("Continue? Y/N");
            cont202 = scnr.nextLine();
        } while (cont202.equals("Y") || cont202.equals("y"));

    }
}
