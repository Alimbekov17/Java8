import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
//        int sum = 0;
//
//        while(true){
//            System.out.print("Enter a number: ");
//            int num = scanner.nextInt();
//            if(num == 0){
//                System.out.println("Amount of entered numbers: " + counter);
//                System.out.println("Sum of entered numbers: " + sum);
//                System.out.println("Arithmetic mean of numbers: " + sum/counter);
//                break;
//            }
//            counter++;
//            sum = sum + num;
//
//
//        }












//        int n = scanner.nextInt();
//        int a = 1;
//
//        for(int i = 1; i <= n; i++){
//            a*=i;
//        }
//        System.out.println(a);




        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        int counter = 1;
        int sum = 0;


        if (num % 2 == 1) {
            int num1 = num - 1;
            while (num1 > counter) {
                if (counter % 2 == 0) {
                    sum += counter;
                    System.out.print(counter + " + ");
                }
                counter++;
            }
            System.out.print(num1 + " = " + (sum + num1));
        } else {
            while (num > counter) {
                if (counter % 2 == 0) {
                    sum += counter;
                    System.out.print(counter + " + ");
                }
                counter++;

            }
            System.out.print(num + " = " + (sum + num));
        }


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int counter = 0;
//        System.out.print("Try your luck, enter 'start': ");
//
//        while(true){
//            String start = scanner.next();
//            int randNum = random.nextInt(1, 10);
//            counter++;
//            if (counter == randNum){
//                System.out.println("Congratulations, you found your lucky dumpling!!! It is number: " + randNum );
//                break;
//            }
//            System.out.print("Try again: ");
//        }
    }
}
