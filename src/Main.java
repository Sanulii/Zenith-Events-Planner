
/*
 * Developer name: Indika
 * last modified date: 2025-01-26
 * purpose:
 */
import java.util.Scanner;

public class Main {
    public static String clientName;
    public static int eventType;


    public static void welcomeMessage() {

        System.out.println("----------------------------------------------------------------");
        System.out.println("----\t\t\tWelcome to Zenith Event Planners\t\t\t----");
        System.out.println("----------------------------------------------------------------\n");

    }

    public static String getClientName() {
        String name; // store the client name
        Scanner s = new Scanner(System.in);
        System.out.print("Enter client name : ");
        name = s.nextLine();
        return name;
    }

    public static int getEventType() {
        int eventType;
        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\t\t\tSelect Your Event Type");
            System.out.println("================================================================");
            System.out.println("\t1 - Wedding\t\t\t-USD 500 Base | Additional 150\\hr");
            System.out.println("\t2 - Birthday Party\t-USD 300 Base | Additional 100\\hr");
            System.out.println("\t3 - Corporate Event\t-USD 400 Base | Additional 120\\hr");
            System.out.println("\t4 - Party\t\t\t-USD 600 Base | Additional 200\\hr");
            System.out.println("================================================================\n");

            System.out.print("Select your option : ");

            eventType = s.nextInt();

            //System.out.println(eventType);

            if (eventType == 1 || eventType == 2 || eventType == 3 || eventType == 4)
                break;
        }
        return eventType;
    }

    public static void getInput() {
        clientName = getClientName();
        eventType = getEventType();
    }

    public static void main(String[] args) {

        welcomeMessage();
        getInput();
        System.out.println(clientName);
        System.out.println(eventType);

    }
}