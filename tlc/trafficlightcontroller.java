```java
import java.util.Scanner;

public class TrafficLightController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     TRAFFIC LIGHT CONTROLLER    ");
        System.out.println("=================================");

        System.out.println("1. RED");
        System.out.println("2. YELLOW");
        System.out.println("3. GREEN");

        System.out.print("Enter traffic light choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("\nTraffic Light: RED");
                System.out.println("Action: STOP");
                break;

            case 2:
                System.out.println("\nTraffic Light: YELLOW");
                System.out.println("Action: GET READY");
                break;

            case 3:
                System.out.println("\nTraffic Light: GREEN");
                System.out.println("Action: GO");
                break;

            default:
                System.out.println("\nInvalid choice!");
                System.out.println("Please enter a number between 1 and 3.");
        }

        scanner.close();
    }
}
```