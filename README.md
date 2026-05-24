# Library Management System (Java Swing UI)

A simple, lightweight Java Swing desktop application designed for logging book issues to students. This project focuses on absolute layout GUI design, clean UI element alignment, and structural form validation using Java's built-in `java.time` APIs and custom exception handling.

---

## What It Does

The application provides a single-frame graphical user interface to collect and process book issuance details.

* **Student Information:** Fields for Student Name and numeric Roll Number.
* **Book Details:** Inputs for Book Title and a dropdown selection for Book Category.
* **Date Tracking:** Input fields for Issue Date and Return Date.
* **Validation Engine:** Enforces structural format checks (`dd/MM/yyyy`) and verifies chronological order (ensuring the return date isn't prior to the issue date) using lenient parsing.
* **Custom Exception Framework:** Utilizes simple, internal exception classes (`EmptyFieldException`, `InvalidRollNumberException`, etc.) to trigger structured `JOptionPane` error dialogs upon incorrect input submission.

---

## Prerequisites

To compile and run this application, you need:

* **Java Development Kit (JDK):** Version 8 or higher installed on your system.
* Any standard terminal, IDE, or GUI builder framework (the code is fully optimized and structured to be compatible with **Eclipse's WindowBuilder** layout tool).

---

## How to Run

You can run this project directly from your terminal by following these steps:

### 1. Clone or Download the Source

Save the source code into a file named `Main.java`.

### 2. Compile the Source Code

Open your terminal or command prompt, navigate to the directory containing `Main.java`, and compile it using `javac`:

```bash
javac Main.java

```

### 3. Execute the Application

Run the compiled bytecode using the `java` launcher:

```bash
java Main

```

> **Note:** When the application runs, default placeholder examples (e.g., `e.g., Ali Ahmed`) are provided inside the fields. Submitting the form with placeholder text or empty fields will trigger the input validation messages.
