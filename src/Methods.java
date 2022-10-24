import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(1, 50);
        }
        System.out.println("Check any number: ");

        randomNumbersArray(array, scanner.nextInt());

    }

    public static void randomNumbersArray(int[] array, int n) {

        Arrays.sort(array);
        int min = array[0];
        int max = array[9];
        System.out.println(Arrays.toString(array));
        System.out.println("Min number in array is: " + min);
        System.out.println("Max number in array is: " + max);


        boolean a = true;
        boolean b = false;
        int counter = 0;

        for (int j : array) {
            counter++;
            if (j >= n) {
                System.out.println(a);
                break;
            } else if (counter == array.length) {
                System.out.println(b);
            }
        }
    }


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("Enter a number: ");
//        digitsSum(scanner.nextInt());
//
//
//
//    }
//
//    public static void digitsSum(int num){
//        int sum = 0;
//        while (num > 0) {
//            int a = num %10;
//            num/=10;
//            sum+=a;
//        }
//        System.out.println(sum);
//    }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name and age: ");
//        myInfo(scanner.next(), scanner.nextInt());
//    }

//    public static void myInfo(String name, int age){
//        System.out.printf("Name: %s\n Age: %d", name, age);
//    }
//    public static void getSum(){
//        int sum = 0;
//        for (int i = 1; i < 300; i++) {
//            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
//    }


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//
//        if (num == 1){
//            hello();
//        } else if (num == 2) {
//            bye();
//        } else {
//            System.out.println("Mynday method jok.");
//        }
//    public static void hello() {
//        System.out.println("Hello");
//    }
//    public static void bye() {
//        System.out.println("Bye");
//    }
//    public static void myMethod() {
//
//        for (int i = 2; i <= 10; i++) {
//            System.out.println();
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " * " + j +" = " + i*j);
//            }
//        }
//
//    }

}
