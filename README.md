1 🏢 Employee Management System

A simple Employee Management System demonstrating Object-Oriented Programming (OOP) concepts in Java, including Encapsulation, Manager-Controller Design, and CRUD operations.

This project provides a secure login mechanism and allows managing employee data efficiently.

1 ✨ Features

2 🔒 Secure Login using Encapsulation for storing username and password.

3 🧑‍💼 Manager Control to decide actions based on login status.
------
📋 CRUD Operations for Employee data:

1 ➕ Create: Add a new employee.

2 👀 Read: View employee details.

3 ✏️ Update: Modify existing employee information.

4 🗑️ Delete: Remove an employee.

5 🛠️ Professional and modular design separating responsibilities:
------
Employee class → Handles CRUD logic.

🧩 Classes Overview
1. 🔐 Encapsulation

Encapsulates user credentials and provides secure login validation.

private String username = "tharun";
private String password = "1234";

public boolean login(String user, String pass) {
    return username.equals(user)
    && password.equals(pass);
}

Manager class → Controls operations based on user instructions.

Encapsulation class → Stores and validates login credentials.

-----
2. 📝 Employee

Handles all CRUD operations for employee records.

public class Employee {
    private int id;
    private String name;
    private String department;

}
-----
3. 🧭 Manager

Controls the flow of the application based on login success.

if(encapsulation.login(userInput, passwordInput)) {

    System.out.println(" Login Successful");

} else {
    System.out.println(" Login Failed");
}
-----
🚀 How to Run

Clone the repository:

git clone <repository-link>


Compile Java files:

javac *.java


Run the program:

java Main

-----
Enter username and password to login and follow instructions for CRUD operations.

💡 Example
Enter Username: tharun
Enter Password: 1234
Login Successful!
Select Action:
1. ➕ Create Employee
2. 👀 View Employee
3. ✏️ Update Employee
4. 🗑️ Delete Employee
----
🛠️ Technologies Used

Java (OOP concepts)

Console-based Java Application

🌟 Future Enhancements

💾 Integrate with Database to persist employee data.

🖥️ Add GUI Interface for a better user experience.

🔑 Implement Role-based Access Control for managers and admins.
