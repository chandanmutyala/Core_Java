public class Customer {
    private int mobileNo;
    private String lastName;
    private String firstName;
    private Passport passport;

    public Customer(int mobileNo, String lastName, String firstName, Passport passport) {
        this.mobileNo = mobileNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "mobileNo=" + mobileNo +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", passport=" + passport +
                '}';
    }
}
