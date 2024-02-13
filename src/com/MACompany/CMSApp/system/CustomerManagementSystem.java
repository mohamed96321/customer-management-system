import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagementSystem {
    private static CustomerManagementSystem instance;
    private CustomerFactory customerFactory;
    private List<Customer> customerList;

    private CustomerManagementSystem() {
        this.customerFactory = new RegularCustomerFactory();
        this.customerList = new ArrayList<>();
    }

    public static CustomerManagementSystem getInstance() {
        if (instance == null) {
            instance = new CustomerManagementSystem();
        }
        return instance;
    }

    public void setCustomerFactory(CustomerFactory customerFactory) {
        this.customerFactory = customerFactory;
    }

    public void addCustomer(String customerId, String firstName, String lastName, String email, String phoneNumber) {
        // Use the customer factory to create a customer based on the current customer type
        Customer newCustomer = customerFactory.createCustomer(customerId, firstName, lastName, email, phoneNumber);
        customerList.add(newCustomer);
        System.out.println("Customer added successfully!");
    }

    public void displayAllCustomers() {
        for (Customer customer : customerList) {
            // Use polymorphism to call the specific displayDetails method based on the customer type
            customer.displayDetails();
        }
    }

    public static void main(String[] args) {
        CustomerManagementSystem cms = CustomerManagementSystem.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Regular Customer");
            System.out.println("2. Add VIP Customer");
            System.out.println("3. Add Premium Customer");
            System.out.println("4. Display All Customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cms.setCustomerFactory(new RegularCustomerFactory());
                    break;

                case 2:
                    cms.setCustomerFactory(new VipCustomerFactory());
                    break;

                case 3:
                    cms.setCustomerFactory(new PremiumCustomerFactory());
                    break;

                case 4:
                    System.out.println("All Customers:");
                    cms.displayAllCustomers();
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter Customer ID: ");
                String customerId = scanner.next();
                System.out.print("Enter First Name: ");
                String firstName = scanner.next();
                System.out.print("Enter Last Name: ");
                String lastName = scanner.next();
                System.out.print("Enter Email: ");
                String email = scanner.next();
                System.out.print("Enter Phone Number: ");
                String phoneNumber = scanner.next();

                cms.addCustomer(customerId, firstName, lastName, email, phoneNumber);
            }
        }
    }
}
