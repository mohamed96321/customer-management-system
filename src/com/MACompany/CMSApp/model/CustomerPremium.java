public class CustomerPremium extends Customer {
    private String membershipType;

    public CustomerPremium(String customerId, String firstName, String lastName, String email, String phoneNumber) {
        super(customerId, firstName, lastName, email, phoneNumber);
        this.membershipType = "Gold";  // Initial membership type for Premium customers
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void upgradeMembership() {
        this.membershipType = "Platinum";
    }

    @Override
    public void displayDetails() {
        System.out.println("Premium Customer Details: " + this.toString() + ", Membership Type: " + membershipType);
    }
}

