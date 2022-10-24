import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter size of array: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(array));
        for (int i = array.length-1; i > -1 ; i--) {
            System.out.print(array[i] + " ");
        }





//        Scanner scanner = new Scanner(System.in);                 Exercise 9
//        Random random = new Random();
//        System.out.print("Enter size of array: ");
//        int arraySize = scanner.nextInt();
//
//        int[] array = new int[arraySize];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(999, 9999);
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = array.length-1; i > -1 ; i--) {
//            System.out.print(array[i] + " ");
//        }




//        Scanner scanner = new Scanner(System.in);                 Exercise 8
//
//        System.out.print("Quantity of tickets: ");
//        int ticketsAvailable = scanner.nextInt();
//        System.out.println(ticketsAvailable + " tickets available.");
//        System.out.println();
//        int ticketsToBuy = 0;
//        int buyerCounter = 0;
//        int rejectCounter = 0;
//
//        if (ticketsAvailable > 0) {
//
//            while(true){
//                System.out.print("How many tickets would you like to buy?: ");
//                ticketsToBuy = scanner.nextInt();
//                while (ticketsToBuy > ticketsAvailable){
//                    System.out.println("Sorry! We can't accept your request!");
//                    System.out.print("Next: ");
//                    rejectCounter++;
//                    ticketsToBuy = scanner.nextInt();
//                    System.out.println();
//                }
//                System.out.println("Thank you for your purchase!\nYou bought " + ticketsToBuy + " tickets.");
//                System.out.println();
//                ticketsAvailable-=ticketsToBuy;
//                buyerCounter++;
//                if (ticketsAvailable==0){
//                    System.out.println("All tickets sold out.");
//                    System.out.println("Rejected buyers: " + rejectCounter);
//                    System.out.println("Accepted buyers: " + buyerCounter);
//                    break;
//                }
//            }
//
//
//        } else {
//            System.out.println("Tickets are sold out.");
//        }







//        Scanner scanner = new Scanner(System.in);           Exercise 7
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//
//        int a = 0;
//        int newNum = 0;
//
//        while (num>0){
//            a = num % 10;
//            num /= 10;
//            newNum*=10;
//            newNum+=a;
//        }
//        System.out.println(newNum);

//        Scanner scanner = new Scanner(System.in);           Exercise 6
//
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        System.out.println(num);
//
//        int a = 0;
//        while(num > 0) {
//            a = num % 10;
//            num/=10;
//        }
//        System.out.println(a);



//        Scanner scanner = new Scanner(System.in);           Exercise 4
//        int sum1 = 0;
//        int sum2 = 0;
//        while (true) {
//            System.out.print("Enter first number: ");
//            int num1 = scanner.nextInt();
//            System.out.print("Enter second number: ");
//            int num2 = scanner.nextInt();
//
//            if (num1 != num2){
//                sum1+=num1;
//                sum2+=num2;
//            } else {
//                break;
//            }
//        }
//        System.out.println();
//        System.out.println("Sum of first numbers: " + sum1);
//        System.out.println("Sum of second numbers: " + sum2);



//        Scanner scanner = new Scanner(System.in);        Exercise 3
//
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//
//        do {
//            System.out.print("Enter another number: ");
//            int num1 = scanner.nextInt();
//            num -= num1;
//        } while (num >= 0);
//        System.out.println(num);






//        Random random = new Random();                          Exercise 1
//        int a = random.nextInt(1,99);
//        System.out.println("First random number: " + a);
//
//        int counter = 0;
//        for (int i = 1; i < 20; i++) {
//            int b = random.nextInt(1,99);
//            System.out.print(b + ", ");
//            if (b % a == 0){
//                counter++;
//                System.out.print("<" + b + "> , ");
//            }
//        }
//        System.out.println();
//        System.out.println("Quantity: " + counter);

    }
}
