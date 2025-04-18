
# AmazonSeleniumJavaTask

## 📌 Overview

This project automates the following workflow on [Amazon.eg](https://www.amazon.eg/):

1. **Login** to Amazon.eg.
2. **Navigate** to the "All" menu and select "Video Games" > "All Video Games".
3. **Apply Filters**:
   - **Free Shipping**
   - **Condition: New**
4. **Sort Products** by price: High to Low.
5. **Add Products** priced below 15,000 EGP to the cart.
6. **Iterate Pages**: If no products meet the price criteria on the current page, proceed to the next page.
7. **Check Cart**: make sure that all products is already added to carts
8. **Add New Address**: Fill new address form using @DataProvider
9. **Check Payment Method**: Choose payment method

**Disclaimer:** The email and password provided in LoginPage are created for the purpose of this project only, You can change these credentials and it will work fine

## 🛠️ Technologies Used

- **Java**
- **Selenium WebDriver**
- **Maven** for project management
- **TestNG** for testing framework

## 🚀 Getting Started

### Prerequisites

- **Java JDK** (version 8 or higher)
- **Maven** installed
- **Chrome Browser** installed

### Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/mohamedelshwimy/AmazonSeleniumJavaTask.git
   cd AmazonSeleniumJavaTask
   ```

2. **Build the Project**:

   ```bash
   mvn clean install
   ```

3. **Run the Automation Script**:

   ```bash
   mvn test
   ```

## 🧪 Test Scenarios

The automation script performs the following validations:

- **Login Verification**: Confirms successful login to Amazon.eg.
- **Navigation Check**: Ensures correct navigation to the "All Video Games" section.
- **Filter Application**: Validates the application of "Free Shipping" and "New" condition filters.
- **Sorting Confirmation**: Checks that products are sorted from high to low price.
- **Product Addition**: Adds all products priced below 15,000 EGP to the cart.
- **Pagination Handling**: Moves to the next page if no products meet the price criteria on the current page.
- **Handling Addresses**: Add New address and Remove Address if exists
- **Handling Products in Cart**: Handle Cart to be Emptied before adding items to it

## 📁 Project Structure

```
Foodics_Amazon_Task/
├── src/
│   └── main/
│       └── java/
│           └── Pages
├── src/
│   └── test/
│        └── java/
│             ├── Address/
│             │   └── Address.xlsx
│             ├── Base/
│             │   └── BaseTests
│             └── Scenario/
│                 └── E2EScenario
├── pom.xml
└── README.md
```

## 📄 Dependencies

The project utilizes the following dependencies:

- **Selenium Java**: For browser automation.
- **TestNG**: For structuring and running tests.
- **WebDriverManager**: For automatic management of browser drivers.

These dependencies are managed via Maven and specified in the `pom.xml` file.

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch:

   ```bash
   git checkout -b feature/YourFeature
   ```

3. Commit your changes:

   ```bash
   git commit -m "Add YourFeature"
   ```

4. Push to the branch:

   ```bash
   git push origin feature/YourFeature
   ```

5. Open a pull request.
