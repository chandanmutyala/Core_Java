public class Passport {

    String passportNo;
    String dateOfExpiry;
    String address;

    public Passport(String passportNo, String dateOfExpiry, String address) {
        this.passportNo = passportNo;
        this.dateOfExpiry = dateOfExpiry;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNo='" + passportNo + '\'' +
                ", dateOfExpiry='" + dateOfExpiry + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
