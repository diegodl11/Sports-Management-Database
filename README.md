# Sports Event Management System

![image](https://github.com/user-attachments/assets/6d4dc047-a549-4ced-9389-937e1f6a199d)


This project is a sports event management application developed as part of a university database course. It provides a Java-based graphical interface that connects to an Oracle SQL database, allowing users to manage various aspects of sports events, including teams, workers, coaches, referees, materials, and collaborators.

## Project Structure

The project is divided into two main components:

1. **SQL Database Structure**: The `system.sql` file contains all the necessary tables and sample data to simulate a sports event. Key tables include:
   - **PLAYS**: Tracks players in matches.
   - **COACH**: Records coaching details.
   - **MATCH_**: Manages match details, including referees and courts.
   - **MATERIAL**: Stores information about the materials used in events.

2. **Java Application**: Developed using the Model-View-Controller (MVC) pattern, the Java application includes modules for database interaction and interface control, allowing the user to add, update, and delete records.

### Key Functionalities

- **Worker Management**: Add, view, update, and delete workers assigned to events.
- **Collaborator Management**: Track companies collaborating in each event and the resources they provide.
- **Match Management**: Update referees and view match-related information.
- **Material Management**: Manage materials, their providers, and usage in different event editions.

## Installation

### Prerequisites

- **Oracle SQL Database**: Install and configure an Oracle SQL database, or use any other Oracle-compatible SQL database.
- **Java Development Kit (JDK)**: Version 8 or higher.
- **Eclipse IDE**: Recommended for the Java application. The project uses the WindowsBuilder plugin for UI management.
- **SQL Developer** (Optional): For managing the SQL database outside of the application.

### Setup

1. **Database Setup**
   - Execute the SQL commands in `system.sql` to create tables and insert initial data into the Oracle SQL database.
   - Update the database connection information in the `Database.java` file (e.g., `host`, `port`, `SID`, `user`, and `password`).

2. **Java Application Setup**
   - Open the project in Eclipse IDE.
   - Ensure the `jdbc` library (included in the `lib` folder) is added to the project’s build path.

3. **Running the Application**
   - Run the main class to launch the application.
   - Use the graphical interface to interact with the database for managing sports event data.

## Future Enhancements

- **Security**: Implement user authentication and encryption for sensitive data.
- **Extended Functionality**: Add search, reporting tools, and data visualization features.
- **Internationalization**: Support multiple languages and customizable formats for broader accessibility.

---

If you wish to contribute to this project, feel free to fork the repository and submit a pull request with your improvements.

This project is licensed under the MIT License. See the LICENSE file for more details.
