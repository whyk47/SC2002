package lab3;

public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seat_id) {
        seatId = seat_id;
        assigned = false;
    }

    public int getSeatId() {
        return seatId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public boolean isOccupied() {
        return assigned;
    }
    public void assign(int cust_id) {
        assigned = true;
        customerId = cust_id;
    }

    public void unassign() {
        assigned = false;
        customerId = -1;
    }
}
