import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] zarplata = new int[3];
        int counter = 0;
        for (int i = 0; i < zarplata.length; i++) {
            counter++;
            System.out.printf("Zarplata %s: ", counter);
            int zp = scanner.nextInt();
            zarplata[i] = zp;
        }

        if (zarplata[0] > zarplata[1] && zarplata[0] > zarplata[2]){
            System.out.println("Samaya vysokaya zarplata: " + zarplata[0]);
        } else if (zarplata[1] > zarplata[0] && zarplata[1] > zarplata[2]) {
            System.out.println("Samaya vysokaya zarplata: " + zarplata[1]);
        } else if (zarplata[2] > zarplata[0] && zarplata[2] > zarplata[1]) {
            System.out.println("Samaya vysokaya zarplata: " + zarplata[2]);
        }


//        Random random = new Random();
//        int[] array1 = new int[5];
//        int[] array2 = new int[5];
//
//
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = random.nextInt(0, 5);
//        }
//        System.out.println(Arrays.toString(array1));
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = random.nextInt(0, 5);
//        }
//        System.out.println(Arrays.toString(array2));
//
//
//        for (int i = 0; i < 5; i++) {
//            if(array1[i] == array2[i]){
//                System.out.println(array1[i] + " = " + array2[i]);
//            } else if (array1[i]>array2[i]) {
//                System.out.println(array1[i] + " > " + array2[i]);
//            } else {
//                System.out.println(array1[i] + " < " + array2[i]);
//            }
//        }









        //        int sum = 0;
//        int sum2 = 0;
//        int counter1 = 0;
//        int counter2 = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = random.nextInt(1, 100);
//            if (numbers[i] > 50){
//                sum+=numbers[i];
//                counter1++;
//                System.out.print(numbers[i] + " ");
//            } else {
//                sum2+=numbers[i];
//                counter2++;
//                System.out.print(numbers[i] + " ");
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(sum/counter1);
//        System.out.println(sum2/counter2);
//        System.out.println(Arrays.toString(evenNumbers));
//        System.out.println("Arithmetic mean: " +sum/evenNumbers.length);

//        for (int i = 1; i <= 8; i++) {
//            System.out.println();
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//        }
//        for (int i = 8; i >= 1 ; i--) {
//            System.out.println();
//            for (int j = 1; j < i; j++) {
//                System.out.print(j + " ");
//            }
//        }

















//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 0;
//        int summa = 0;
//
//        while (true) {
//            System.out.print("san beriniz: ");
//            int number = scanner.nextInt();      // 0
//
//            if(number == 0) {
//                System.out.println(number);     // 0
//                System.out.println("kolichestvo: " + counter);  // 3
//                System.out.println("Summa: " + summa);   // 17
//                break;
//            }
//            counter++;            // 3
//            summa+=number;          // 0 + 5 + 4 + 8
//
//        }




















//
//        while(number - 1  > counter) {
//            counter++;                      // 4
//            summa+=counter;                 // 0+1+2+3+4
//            System.out.print(counter + " + ");
//        }
//
//
//        System.out.println(number + " = " + (summa + number));
































//        switch (text) {
//            case "dollar":
//                System.out.println("84som");
//                break;
//            case "euro":
//                System.out.println("82som");
//                break;
//            default:
//                System.out.println("mynday valyuta jok");
//                break;
//        }










//        while (san1 > 0) {          // 1223 > 0    |   122 > 0       12 > 0      1 > 0
//            int kaldyk1 = san1 % 10;   // san2 = 3        san2 = 2      san2 = 2;
//            san1 /= 10;             // san1 = 122      san1 = 12     san1 = 1;    san1 = 0;
//            int kaldyk2 = san1 % 10;  // san3 = 2;       san3 = 2      san3 = 1;
//
//            // (3 == 2 )
//            // (2 == 2 )
//            // (2 == 1 )
//            if (kaldyk1 == kaldyk2) {
//                System.out.print(" Same numbers: " + kaldyk1);
//                System.out.println(kaldyk2);
//            }

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt(); //10
//        int counter = 0;
//        int summa = 0;
////            0 stop
//        while(number>counter){
//            counter++; //10
//            summa+=counter; // 1+2+3+4+5+6+7+8+9+10 =
//        }
//        System.out.println(summa);


        }
}
