# customer-management-system

**System Road:**
```
|-- src
|   |-- com
|       |-- yourcompany
|           |-- yourproject
|               |-- model
|               |   |-- CustomerType.java
|               |   |-- Customer.java
|               |   |-- CustomerRegular.java
|               |   |-- CustomerVIP.java
|               |   |-- CustomerPremium.java
|               |-- factory
|               |   |-- CustomerFactory.java
|               |   |-- RegularCustomerFactory.java
|               |   |-- VipCustomerFactory.java
|               |   |-- PremiumCustomerFactory.java
|               |-- system
|                   |-- CustomerManagementSystem.java
|-- out
```

## Project Overview
The Customer Management System is a Java-based project designed to manage and organize customer information efficiently. The system incorporates a well-structured folder hierarchy for better organization and modularity. 

### How to Compile and Run the CMS Application
To compile and run the cms application, use the following commands in the terminal:

**Compile files:**
```bash
javac -d out src/com/yourcompany/yourproject/model/*.java src/com/yourcompany/yourproject/factory/*.java src/com/yourcompany/yourproject/system/*.java
```

**Run files:**
```bash
java -cp out CustomerManagementSystem
```