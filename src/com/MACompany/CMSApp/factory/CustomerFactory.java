public interface CustomerFactory {
    Customer createCustomer(String customerId, String firstName, String lastName, String email, String phoneNumber);
}
