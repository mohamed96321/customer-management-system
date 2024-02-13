public class CustomerRegular extends Customer {
    public CustomerRegular(String customerId, String firstName, String lastName, String email, String phoneNumber) {
        super(customerId, firstName, lastName, email, phoneNumber);
    }

    @Override
    public void displayDetails() {
        System.out.println("Regular Customer Details: " + this.toString());
    }
}

