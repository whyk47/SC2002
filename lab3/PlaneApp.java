package lab3;

import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assignments by customer I");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");

        Scanner sc = new Scanner(System.in);
        Plane p = new Plane();
        while (true) {
            System.out.print("Enter the number of your choice: ");
            int choice = sc.nextInt();
            if (choice > 6 || choice < 1) {
                break;
            }
            int seatId;
            switch (choice) {
                case 1: p.showNumEmptySeats(); break;
                case 2: p.showEmptySeats(); break;
                case 3: p.showAssignedSeats(true); break;
                case 4: p.showAssignedSeats(false); break;
                case 5:
                System.out.println("Assigning Seat ..");
                System.out.print("Please enter SeatID: ");
                seatId = sc.nextInt();
                System.out.print("Please enter Customer ID: ");
                int custId = sc.nextInt();
                p.assignSeat(seatId, custId); 
                break;
                case 6: 
                System.out.print("Enter SeatID to unassign customer from: "); 
                seatId = sc.nextInt();
                p.unassignSeat(seatId);
                break;
            }
        }
        sc.close();
    }
}
