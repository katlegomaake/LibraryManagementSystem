# LibraryManagementSystem

Introduction
Welcome to the Library Management System! This Java-based system aims to automate various tasks in a library, including managing books and library members, searching for books, borrowing, and returning books.

Objectives
Properly handle errors using exceptions.
Validate program state using assertions.
Utilize collections and generics for efficient data management.
Implement search functionality using strings and regular expressions.


Project Tasks
Task 1: Implementing the Book and Member Classes
Book Class: Represents a book with properties such as Title, Author, ISBN, and IsAvailable status.
Member Class: Represents a library member with properties like Name, Email, and a list of borrowed books.
Task 2: Managing Collections
Utilize generics to manage collections of books and members.
Task 3: Implementing Search Functionality
Allow users to search for books by title or author using string manipulation and search techniques.
Task 4: Handling Book Checkouts
Implement a checkout system where members can borrow books if available, handling exceptions for unavailable books.
Task 5: Assertions and Input Validation
Use assertions to ensure proper book checkout and return processes.
Validate user inputs, such as email formats, using regular expressions and exceptions


Sure, I'll help you create a README file for your Library Management System project. Here's a template you can use:

Library Management System
Introduction

Welcome to the Library Management System! This Java-based system aims to automate various tasks in a library, including managing books and library members, searching for books, borrowing, and returning books.

Objectives


Properly handle errors using exceptions.
Validate program state using assertions.
Utilize collections and generics for efficient data management.
Implement search functionality using strings and regular expressions.
Project Tasks
Task 1: Implementing the Book and Member Classes
Book Class: Represents a book with properties such as Title, Author, ISBN, and IsAvailable status.
Member Class: Represents a library member with properties like Name, Email, and a list of borrowed books.
Task 2: Managing Collections
Utilize generics to manage collections of books and members.
Task 3: Implementing Search Functionality
Allow users to search for books by title or author using string manipulation and search techniques.
Task 4: Handling Book Checkouts
Implement a checkout system where members can borrow books if available, handling exceptions for unavailable books.
Task 5: Assertions and Input Validation
Use assertions to ensure proper book checkout and return processes.
Validate user inputs, such as email formats, using regular expressions and exceptions.
Additional Features
Simple text-based menu system for user interaction.
Robust error handling with user-friendly error messages.
Clear and concise code with proper comments explaining the logic.
Submission Guidelines
Source Code Files: Submit all source code files.
README Document: Include a brief document explaining design decisions and how each objective was addressed.
Unit Tests: Provide unit tests demonstrating the use of exceptions, assertions, collections, and string manipulations.

Instructions
To run the Library Management System:

Compile all Java files.
Run the LibraryManagementSystem class.
Follow the on-screen instructions to navigate through the system.


Code Description: Library Management System
The Library Management System is a Java-based application designed to automate various tasks within a library environment. This system facilitates the management of books, library members, borrowing, and returning processes, providing a seamless experience for both librarians and library users.

Classes:
Book:
The Book class represents individual books within the library.
It encapsulates properties such as ISBN, title, author, and availability status.
Methods enable retrieval of book details and toggling the availability status.
User:
The User class represents registered members of the library.
It stores user information including ID, name, student ID, and email address.
Methods allow access to user details.
BorrowingRecord:
The BorrowingRecord class tracks the borrowing history of books by users.
Each record contains information about the borrowed book, the borrowing user, and the borrow date.
Library:
The Library class serves as the central hub for managing books, users, and borrowing records.
It provides methods for adding books and users, borrowing and returning books, and displaying book availability and user information.
Main Class: LibraryManagementSystem
The LibraryManagementSystem class drives the application's functionality.
It presents a user-friendly text-based menu interface for interacting with the library system.
The main method orchestrates user input processing and invokes corresponding methods from the Library class to execute desired actions.
Features:
Book and User Management: Allows librarians to add new books to the library and register new members efficiently.
Borrowing and Returning Books: Facilitates seamless borrowing and returning processes, updating book availability status accordingly.
User-Friendly Interface: Presents users with a straightforward menu system for easy navigation and interaction.
Error Handling: Ensures robust error handling throughout the system, providing clear and informative error messages to users when issues arise.
Data Validation: Implements validation mechanisms, such as regular expressions, to ensure the integrity of user-provided data.
Instructions for Running the Program:
Compile all Java source files.
Execute the LibraryManagementSystem class.
Follow the on-screen prompts to navigate and utilize the library system effectively.
Purpose:
The Library Management System aims to streamline library operations, enhance user experience, and promote efficient management of library resources. By automating manual processes and providing intuitive interfaces, this application empowers librarians to focus on delivering high-quality services while enabling patrons to access and utilize library resources seamlessly
