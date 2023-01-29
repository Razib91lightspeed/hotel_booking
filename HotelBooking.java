import java.util.Scanner;

public class HotelBooking {
    private static int numRooms;
    private static boolean[] roomAvailability;
    private static String[] roomTypes;
    private static double[] roomPrices;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initialize number of rooms and room availability
        numRooms = 10;
        roomAvailability = new boolean[numRooms];
        roomTypes = new String[numRooms];
        roomPrices = new double[numRooms];

        // initialize room information
        for (int i = 0; i < numRooms; i++) {
            roomAvailability[i] = true;
            roomTypes[i] = "Standard Room";
            roomPrices[i] = 100.0;
        }

        // main loop for hotel booking system
        while (true) {
            System.out.println("Welcome to the Hotel Booking System!");
            System.out.println("1. View available rooms");
            System.out.println("2. Book a room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                viewAvailableRooms();
            } else if (choice == 2) {
                bookRoom();
            } else if (choice == 3) {
                System.out.println("Thank you for using the Hotel Booking System!");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void viewAvailableRooms() {
        System.out.println("Available Rooms:");
        for (int i = 0; i < numRooms; i++) {
            if (roomAvailability[i]) {
                System.out.println(i + 1 + ". " + roomTypes[i] + " - $" + roomPrices[i]);
            }
        }
    }

    public static void bookRoom() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the room number you want to book: ");
        int roomNum = input.nextInt();
        roomNum--;

        if (roomAvailability[roomNum]) {
            roomAvailability[roomNum] = false;
            System.out.println("Room " + (roomNum + 1) + " has been booked!");
        } else {
            System.out.println("Sorry, room " + (roomNum + 1) + " is not available.");
        }
    }
}
