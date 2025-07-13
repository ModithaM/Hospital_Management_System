# Hospital Management System
![1747408083356](https://github.com/user-attachments/assets/b5b27132-6104-47ac-8bf5-37323752e384)


![1747408105174](https://github.com/user-attachments/assets/65d8b0db-ba79-4172-a545-b1c265f86a18)

A comprehensive Java-based Hospital Management System designed to handle administrative tasks such as patient management, appointments, doctor records, and billing. Built as an Eclipse project with a MySQL database backend.

## Introduction

This project aims to simplify hospital operations by automating key processes. It supports multiple modules including patient admission, doctor scheduling, billing, and record management. The backend is powered by MySQL, and the application is developed using Java within the Eclipse IDE.

## Features

- Patient registration and management
- Doctor profiles and schedules
- Appointment booking
- Billing and payment records
- Secure login for admin and staff
- MySQL database integration
- Configurable properties file

## Installation

To set up the project locally:

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/hospital-management-system.git
   cd hospital-management-system


2.  **Open in Eclipse**
    
    *   Open Eclipse.
        
    *   Select File > Import > Existing Projects into Workspace.
        
    *   Choose the cloned folder.
        

3.  **Configure the project** (see below).

## Configuration

1.  Navigate to the src/java/com/util directory inside the project.
    
2.  Locate the file named sample.config.properties.
    
3.  Create a copy and rename it to config.properties.
    
4.  Open config.properties and update the following database credentials.
    ```bash
    webAppDir=
    useLocalDatabase=true

    //local database config
    url=jdbc:mysql://localhost:3306/health-lanka
    username=root
    password=yourpassword
    

## Database Setup

1.  Ensure MySQL is installed and running on your machine.
    
2.  Open your MySQL client (like MySQL Workbench or command line).
    
3. Import the database dump.

## Usage

*   Run the project from Eclipse.
    
*   The main interface will launch, allowing login and access to hospital management modules.
    

## Dependencies

*   Java SE 8 or higher
    
*   Eclipse IDE
    
*   MySQL Server
    
*   JDBC Connector (added to project libraries)
    

## Examples

*   Registering a new patient
    
*   Scheduling appointments
    
*   Viewing doctor schedules
    
*   Generating billing statements
    

## Troubleshooting

*   **Database connection issues**: Check your config.properties file for correct credentials.
    
*   **Project not recognized in Eclipse**: Make sure you're importing as an _Existing Project into Workspace_.
    
*   **Missing JDBC driver**: Ensure the MySQL JDBC connector JAR is included in the project libraries.
    
## Contributors

    

> If you would like to contribute, please fork the repository and submit a pull request.
