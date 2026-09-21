# Hammad_java

A **School Management System** built with **Java Swing**.

Repository: https://github.com/Abdul17rahman/Hammad_java

## About

This project is a desktop application for managing school-related records and operations, built using Java's Swing GUI toolkit. It follows a NetBeans project structure and connects to a Microsoft SQL Server database via the bundled JDBC driver.

## Tech Stack

- **Language:** Java
- **GUI Framework:** Java Swing
- **Database:** Microsoft SQL Server (via Microsoft JDBC Driver 6.0)
- **Reporting:** JasperReports / iReport
- **Build System:** Apache Ant (NetBeans-generated `build.xml`)

## Project Structure

```
Hammad_java/
├── Microsoft JDBC Driver 6.0 for SQL Server/   # JDBC driver used to connect to SQL Server
│   └── sqljdbc_6.0/enu/
├── build/classes/                              # Compiled .class output
├── ireport jar/                                # iReport tooling for designing reports
├── jaspersoft/jaspersoft/                      # JasperReports libraries
├── nbproject/                                  # NetBeans project configuration
├── src/                                        # Application source code
├── build.xml                                   # Ant build script
├── manifest.mf                                 # JAR manifest
└── filename.jpeg                               # Project image/screenshot asset
```

## Prerequisites

- Java Development Kit (JDK) 8 or later
- NetBeans IDE (recommended, since the project includes `nbproject` configuration)
- Microsoft SQL Server (local or remote instance)
- Apache Ant (bundled with NetBeans, or installed separately)

## Setup & Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/Abdul17rahman/Hammad_java.git
   cd Hammad_java
   ```

2. **Open in NetBeans**
   - Launch NetBeans IDE
   - Select `File > Open Project` and point it to the cloned `Hammad_java` folder

3. **Configure the database connection**
   - Ensure Microsoft SQL Server is running and a database is created for the application
   - Update the database connection string/credentials in the relevant source file(s) under `src/`
   - The Microsoft JDBC Driver (v6.0) is already included in the repository — make sure it's added to the project's libraries in NetBeans

4. **Build the project**

   ```bash
   ant build
   ```

   or use NetBeans' built-in **Build Project** option.

5. **Run the application**
   - Use NetBeans' **Run Project** button, or
   - Run the compiled JAR from `build/classes` (or `dist/` if generated) once built

## Reports

The project includes **JasperReports** and **iReport** resources for generating printable reports (e.g., student records, results, invoices). Report templates can be edited using iReport Designer, matched against the jar files provided in `ireport jar/` and `jaspersoft/jaspersoft/`.

## Notes

- This is a school project / learning exercise focused on Java Swing desktop application development with database connectivity and reporting.
- Update database credentials before running — none are provided in this README for security reasons.

## License

No license specified. Contact the repository owner ([Abdul17rahman](https://github.com/Abdul17rahman)) for usage permissions.

## Project Screenshots 

<img width="1920" height="1080" alt="1729070725664" src="https://github.com/user-attachments/assets/06090ea9-0a2f-45d1-b56b-f5badc2da488" />

<img width="1606" height="978" alt="bandicam 2023-11-23 21-37-56-438" src="https://github.com/user-attachments/assets/aca48081-2ebb-4847-b49d-a67ef1dbe05b" />

<img width="1606" height="978" alt="bandicam 2023-11-23 21-47-57-330" src="https://github.com/user-attachments/assets/c8cdb6a5-ec3c-4592-8bf9-a9d6f8e0d7f2" />

<img width="1606" height="978" alt="bandicam 2023-11-23 21-42-15-256" src="https://github.com/user-attachments/assets/eb68abf6-f9b8-46df-b88b-32598848e96e" />

<img width="568" height="749" alt="20231123_215142" src="https://github.com/user-attachments/assets/63dbcb9b-5ceb-4fb8-be3f-38fa1165f52a" />




