public class CustomerVIP extends Customer {
    private int loyaltyPoints;

    public CustomerVIP(String customerId, String firstName, String lastName, String email, String phoneNumber) {
        super(customerId, firstName, lastName, email, phoneNumber);
        this.loyaltyPoints = 100;  // Initial loyalty points for VIP customers
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }

    @Override
    public void displayDetails() {
        System.out.println("VIP Customer Details: " + this.toString() + ", Loyalty Points: " + loyaltyPoints);
    }
}
