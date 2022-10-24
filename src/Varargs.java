import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Varargs {
    public static void main(String[] args) {

        String word = "Hello";

        System.out.println(word.trim());
        String newWord = word.toLowerCase();
        if (newWord.contains("l")){
            String wordTwo = newWord.replace("l", "h");
            System.out.println(wordTwo);
        }
        System.out.println(newWord.contains(word.toLowerCase()));
        System.out.println(newWord.contains("h"));
        System.out.println(newWord.charAt(4));
        System.out.println(newWord.substring(0, 3));
        System.out.println(newWord);
        System.out.println(newWord.length());




//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a name: ");
//
//    method(scanner.next(), scanner.next(), scanner.next(), scanner.next());
//    }
//    public static void method(String ... namesList){
//        for (String name : namesList) {
//            System.out.println("I love you " + name);
//
//        }

    }


}
