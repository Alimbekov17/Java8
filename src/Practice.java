import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Random luckyNum = new Random();
//        int a = luckyNum.nextInt(1, 10);
//        System.out.println(a);
//        long a = 55;
//        int b = (int)a;
//        float c = (float)b;
//        String d = String.valueOf(b);
//        System.out.println(d);
//        System.out.println(a + 5);

//        String a = "123";
//        int b = Integer.parseInt(a);
//        System.out.println(b + 50);
//
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int a3= a % 10;
//        a/=10;
//        int a2 = a% 10;
//        a/=10;
//        int a1=a%10;
//        System.out.println(a3 + " " + a2 + " " + a1);

//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//
//        if(a==1 || a == 3 || a == 5){
//            System.out.println("Java");
//        } else if(a==2 || a == 4 ){
//            System.out.println("TechEng");
//        } else if(a == 6 || a == 7){
//        System.out.println("Rest Day");
//        } else {
//            System.out.println("Invalid Day");
//        }
//
//
//
//        switch (a) {
//            case 1,3,5 -> System.out.println("Java");
//            case 2,4 -> System.out.println("Tech Eng");
//            case 6,7 -> System.out.println("Rest Day");
//            default -> System.out.println("Invalid Day");
//        }
//        Random randNum = new Random();
//        int a = randNum.nextInt(1,10);
//        if (a%2==1) {
//            System.out.println(a + " is odd number");
//        } else {
//            System.out.println(a + " is even number");
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter h: ");
//        int b = scanner.nextInt();
//        Random random = new Random();
//        int a = random.nextInt(1, 10);
//        System.out.println("l = " + a);
//
//        System.out.println(a==b?"kvadrat":"tik burchtuk");
//
        Scanner trafficLights = new Scanner(System.in);

        System.out.print("Enter any minute from 1 to 60: ");

        int minute = trafficLights.nextInt();
        int num = (minute-7)/2;
        if (minute <= 3) {
            System.out.println("Green");
        } else if(minute <= 6) {
            System.out.println("Red");
        } else if(Math.floor(num)%2 == 0){
            System.out.println("Green");
        } else {
            System.out.println("Red");
        }
//        if (b == a) {
//            System.out.println("kvadrat");
//        } else {
//            System.out.println("tort burchtuk");
//        }
    }
}
