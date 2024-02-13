public class RegularCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer(String customerId, String firstName, String lastName, String email, String phoneNumber) {
        return new CustomerRegular(customerId, firstName, lastName, email, phoneNumber);
    }
}
