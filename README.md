
## Project Overview
This project demonstrates how to connect Java programs with Oracle 10g XE database using JDBC.  
It covers three main tasks:
1. **Oracle Database Connection** – Establish a connection from Java to Oracle.
2. **Display Student Records** – Retrieve and display data from the `students` table.
3. **Insert Student Records** – Insert new student information into the database using user input.

The project provides step-by-step explanations, Java source code, and screenshots for academic and practical learning purposes.

---

## Database Setup
Ensure Oracle 10g XE is installed and running.  
The `students` table should exist:

```sql
CREATE TABLE students (
    id NUMBER,
    name VARCHAR2(50),
    age NUMBER
);
Concepts Covered
JDBC Driver and DriverManager
Connection handling
Statement & executeUpdate()
ResultSet (for fetching data)
Scanner for user input
SQLException handling
Basic database operations (SELECT, INSERT)
