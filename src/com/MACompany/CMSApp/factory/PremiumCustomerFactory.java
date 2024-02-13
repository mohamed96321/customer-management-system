public class PremiumCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer(String customerId, String firstName, String lastName, String email, String phoneNumber) {
        return new CustomerPremium(customerId, firstName, lastName, email, phoneNumber);
    }
}
