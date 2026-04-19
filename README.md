# Meeting Room Booking System

## 📌 Project Title
Meeting Room Booking System

## 👤 Student
Name: ARUUKE B

---

## 📖 Description
The Meeting Room Booking System is a simple Java application that allows users to manage meeting room reservations inside an organization.  
The system provides a graphical user interface (GUI) and supports basic CRUD operations with data persistence using file storage.

---

## 🎯 Objectives
- Create a simple booking management system for meeting rooms
- Apply Object-Oriented Programming (OOP) principles in a real project
- Implement CRUD operations (Create, Read, Update, Delete)
- Store data in files for persistence
- Provide a user-friendly GUI interface
- Ensure input validation and error handling

---

## ⚙️ Features

- Add a new booking
- View all bookings in a table
- Update existing booking (change room)
- Delete booking by ID
- Input validation (empty fields, email check)
- Data saving to file (bookings.txt)
- Data loading on application start
- GUI-based interface (Swing)

---

## 🧱 Project Structure

- Main.java – Entry point of the application
- GUI.java – Graphical user interface (Swing)
- Booking.java – Model class (represents a booking)
- BookingService.java – Business logic (CRUD operations)
- FileManager.java – Handles file saving and loading

---

## 🧠 OOP Principles Used

### 1. Encapsulation
All fields in Booking class are private and accessed via getters/setters.

### 2. Inheritance (basic demonstration)
User/Admin structure can be extended for role-based access (if implemented).

### 3. Polymorphism
Methods like update/print behavior can be overridden in extended versions of the system.

---

## 💾 Data Persistence
All bookings are stored in a file:

Data is automatically saved after every change (add/update/delete).

---

## ▶️ How to Run

1. Open project in IntelliJ IDEA
2. Make sure JDK is installed (17+ recommended)
3. Run Main.java
4. GUI window will open automatically

---

## 🧪 Test Cases

### ➕ Add Booking
Input:
- Room: A101
- Date: 2026-04-17
- Time: 10:00
- Email: test@gmail.com

Expected result:
- Booking is added to table
- Data is saved to file

---

### ❌ Invalid Input
Input:
- Room: (empty)
- Email: test

Expected result:
- Booking is not created
- No crash occurs

---

### 🗑 Delete Booking
Input:
- ID: 1

Expected result:
- Booking with ID 1 is removed

---

### ✏ Update Booking
Input:
- ID: 1
- New Room: B202

Expected result:
- Room is updated in table and file

---

## 📊 Notes
- The system uses Java Swing for GUI
- Data is stored locally using file system
- No database is required
- Designed for educational OOP demonstration

















