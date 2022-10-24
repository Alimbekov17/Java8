import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReturnMethods {
    public static void main(String[] args) {
        System.out.println("Array in descending order: ");
        System.out.println(Arrays.toString(myMethod(new int[]{3, 4, 82, 24, 5, 11, 100, 61, 1, 15, 77})));
    }
    public static int[] myMethod(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        return array;


    }





//        voidMethod();
//        System.out.println(returnMethod());
//        System.out.println(getWord());
//
//
//
//    }
//    public static void voidMethod(){
//        System.out.println(1010 + 1010);
//    }
//    public static int returnMethod(){
//
//        return 1010 + 1010;
//    }
//    public static String getWord(){
//        return "Hello";
//    }
}
