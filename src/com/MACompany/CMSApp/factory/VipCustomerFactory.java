public class VipCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer(String customerId, String firstName, String lastName, String email, String phoneNumber) {
        return new CustomerVIP(customerId, firstName, lastName, email, phoneNumber);
    }
}
