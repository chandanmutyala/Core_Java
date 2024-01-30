public class Ticket {
    String row;
    String seat;

    public Ticket(String row, String seat) {
        this.row = row;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "row='" + row + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
