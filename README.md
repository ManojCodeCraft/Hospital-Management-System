# 🏥 Hospital Management System

> A comprehensive Java-based application designed to streamline hospital operations, including patient management, doctor scheduling, and administrative tasks. Built using Java, JSP, and Servlets, this system ensures efficient handling of hospital workflows.

---

## 📌 Features

- **Patient Management**: Register, update, and manage patient information.
- **Doctor Scheduling**: Assign doctors to patients and manage their schedules.
- **Appointment Booking**: Facilitate appointment scheduling between patients and doctors.
- **Administrative Control**: Admin panel for overseeing hospital operations.
- **User Authentication**: Secure login system for different user roles.

---

## 🛠️ Technologies Used

- **Frontend**: JSP, HTML, CSS
- **Backend**: Java Servlets
- **Database**: MySQL
- **Build Tool**: Apache Maven
- **Server**: Apache Tomcat

---

## 📁 Project Structure

```
Hospital-Management-System/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── hospital/
│       │           ├── controller/
│       │           ├── dao/
│       │           ├── model/
│       │           └── service/
│       └── webapp/
│           ├── WEB-INF/
│           │   └── web.xml
│           ├── css/
│           ├── js/
│           └── jsp/
├── pom.xml
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Apache Tomcat
- MySQL Server

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/ManojCodeCraft/Hospital-Management-System.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd Hospital-Management-System
   ```

3. **Configure the database**:

   - Create a MySQL database named `hospital_db`.
   - Import the provided SQL script to set up tables.

4. **Update database credentials**:

   - Modify the database configuration in the `dao` package to match your MySQL credentials.

5. **Build the project using Maven**:

   ```bash
   mvn clean install
   ```

6. **Deploy to Tomcat**:

   - Copy the generated WAR file from the `target` directory to the Tomcat `webapps` folder.
   - Start the Tomcat server.

7. **Access the application**:

   - Navigate to `http://localhost:8080/Hospital-Management-System` in your web browser.

---

## 🧑‍💻 Author

**Manoj Kumar**
- 🔗 [LinkedIn](https://www.linkedin.com/in/manoj-kumar-a-21ab69258/)
- 💻 [GitHub](https://github.com/ManojCodeCraft)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
