package lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private final int NUM_SEATS = 12;
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane() {
        seat = new PlaneSeat[NUM_SEATS];
        for (int i = 0; i < NUM_SEATS; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
        numEmptySeat = NUM_SEATS;
    }

    private PlaneSeat[] sortSeats() {
        PlaneSeat[] seats = Arrays.copyOf(seat, NUM_SEATS);
        Arrays.sort(seats, Comparator.comparing(PlaneSeat::getCustomerId));
        return seats;
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats.");
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (PlaneSeat s : seat) {
            if (!s.isOccupied()) {
                System.out.println("SeatID " +s.getSeatId());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        PlaneSeat[] seats = bySeatId ? seat : sortSeats();
        System.out.println("The seat assignments are as follows:");
        for (PlaneSeat s : seats) {
            if (s.isOccupied()) {
                System.out.println("SeatID " + s.getSeatId() + " assigned to CustomerID " + s.getCustomerId());
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        if (seat[seatId - 1].isOccupied()) {
            System.out.println("Seat already assigned to a customer.");
            return;
        }
        seat[seatId - 1].assign(cust_id);
        numEmptySeat--;
        System.out.println("Seat Assigned!");
    }

    public void unassignSeat(int seatId) {
        seat[seatId - 1].unassign();
        numEmptySeat++;
        System.out.println("Seat Unassigned!");
    }
}
