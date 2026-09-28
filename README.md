# TicketHub - Java Full-Stack Ticket Booking App

A beginner-friendly ticket booking project using Java, Spring Boot, MySQL, HTML, CSS and JavaScript.

## 1. Requirements
- JDK 17+
- Maven
- MySQL
- IntelliJ IDEA / Eclipse / VS Code
- A browser

## 2. Database
Create the database:
CREATE DATABASE tickethub;

Then edit:
backend/src/main/resources/application.properties

Set:
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD

## 3. Run backend
Open a terminal inside `backend`:
mvn spring-boot:run

Backend:
http://localhost:8080

## 4. Run frontend
Open `frontend/index.html` with a local web server.
For VS Code, Live Server is convenient.

## 5. Demo flow
1. Open Admin and add a movie.
2. Open Movies.
3. Select Book Now.
4. Select seats.
5. Enter customer details.
6. Confirm booking.
7. View My Bookings.

## Important learning note
The current project demonstrates the architecture and GST calculation. Authentication, payment processing, seat-locking/concurrency, admin authorization, email/SMS, production deployment and real payment gateway integration should be added before treating this as a production booking system.
