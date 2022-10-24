import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = new int[100];
        int anyNym = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            int randNum = random.nextInt(1, 100);
            numbers[i] = randNum;
            if (anyNym == numbers[i]){
                System.out.println("Index: " + i);
            }
        }








//        String[] tvShows = {"Titanic", "Home Alone", "6 Underground", "Untouchables", "Extraction"};
//        String[] movies = new String[5];
//
//        for (int i = 0; i < tvShows.length; i++) {
//            movies[i] = tvShows[i];
//        }
//
//        System.out.println(Arrays.toString(movies));


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int a = scanner.nextInt();
//        int[] numbers = new int[a];
//        int sum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            int randNumbers = random.nextInt(1,25);
//            numbers[i] = randNumbers;
//            sum+=randNumbers;
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("sum = " + sum);

//        for (int i = 0; i < numbers.length; i++) {
//            int randNum = random.nextInt(1,20);
//            numbers[i] = randNum;
//            sum+=randNum;
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("Arithmetic mean: " + sum/10);


    }
}
