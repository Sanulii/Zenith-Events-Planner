
/*
 * Developer name: Indika
 * last modified date: 2025-01-26
 * purpose:
 */
import java.util.Scanner;

public class Main {
    public static String clientName;
    public static int eventType, eventDuration, guestNumber;

    public static int[] optionalServices = {0, 0, 0, 0};

    public static void welcomeMessage() {

        System.out.println("----------------------------------------------------------------");
        System.out.println("----\t\t\tWelcome to Zenith Event Planners\t\t\t----");
        System.out.println("----------------------------------------------------------------\n");

    }

    public static String getClientName() {
        String name; // store the client name
        Scanner s = new Scanner(System.in);
        System.out.print("Enter client name\t: ");
        name = s.nextLine();
        return name;
    }

    public static int getEventType() {
        int eventType;
        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\n\t\t\t\tSelect Your Event Type");
            System.out.println("================================================================");
            System.out.println("\t1 - Wedding\t\t\t-USD 500 Base | Additional 150\\hr");
            System.out.println("\t2 - Birthday Party\t-USD 300 Base | Additional 100\\hr");
            System.out.println("\t3 - Corporate Event\t-USD 400 Base | Additional 120\\hr");
            System.out.println("\t4 - Party\t\t\t-USD 600 Base | Additional 200\\hr");
            System.out.println("================================================================\n");

            System.out.print("Select your option\t: ");

            eventType = s.nextInt();

            System.out.println("\n================================================================");

            //System.out.println(eventType);

            if (eventType == 1 || eventType == 2 || eventType == 3 || eventType == 4)
                break;
        }
        return eventType;
    }

    public static int getEventDuration() {
        int eventDuration;
        Scanner s = new Scanner(System.in);

        System.out.println("\n*************  Event Duration & Guest Expectation  *************");
        System.out.print("Enter the duration in Hours\t: ");
        eventDuration = s.nextInt();

        return eventDuration;

    }

    public static int getGuestNumber() {
        int guestNumber;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of guests\t: ");
        guestNumber = s.nextInt();

        return guestNumber;

    }

    public static int optionalServices() {

        String choice;

        Scanner s = new Scanner(System.in);

        System.out.println("Do you want any optional services ? (Y\\N) ");
        choice = s.nextLine();


        if (choice.equalsIgnoreCase("Y")){

            System.out.println("\n\t\t\t\tSelect Extra Services");
            System.out.println("================================================================");
            System.out.print("Please select (Y\\N)");

            System.out.print("\t1 - Catering\t\t- ");
            choice = s.nextLine();
            optionalServices[0] = choice.equalsIgnoreCase("Y")? 1: 0;

            System.out.print("\t2 - Decoration\t\t- ");
            choice = s.nextLine();
            optionalServices[1] = choice.equalsIgnoreCase("Y")? 1: 0;

            System.out.print("\t3 - Live Entertainment\t\t- ");
            choice = s.nextLine();
            optionalServices[2] = choice.equalsIgnoreCase("Y")? 1: 0;

            System.out.print("\t4 - Photography\t\t- ");
            choice = s.nextLine();
            optionalServices[3] = choice.equalsIgnoreCase("Y")? 1: 0;

        }
        else {

            System.out.println("Moving on....\n");

        }



    }

    public static void getInput() {
        clientName = getClientName();
        eventType = getEventType();
        eventDuration = getEventDuration();
        guestNumber = getGuestNumber();
    }

    public static void main(String[] args) {

        welcomeMessage();
        getInput();

        System.out.println(clientName);
        System.out.println(eventType);
        System.out.println(eventDuration);
        System.out.println(guestNumber);

    }
}