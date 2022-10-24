import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minute from 1 to 60: ");
        int minute = scanner.nextInt();

        if (minute%10 == 1 || minute%10 == 2 || minute%10 == 3|| minute%10 == 6|| minute%10 == 7|| minute%10 == 8){
            System.out.println("Green");
        } else {
            System.out.println("Red");
        }
    }
}
