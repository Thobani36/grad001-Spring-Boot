# Waste Sorting Mobile Application - REST API Implementation

This repository contains the implementation of the RESTful API for the **Waste Sorting Mobile Application** developed by **Enviro365**. The application aims to provide users with guidelines for waste disposal and recycling, encouraging environmentally conscious behavior.

## Key Features:
- **Waste Category Management**: CRUD operations for waste categories (e.g., plastic, paper, metal, etc.).
- **Spring Boot Application**: Built with Spring Boot to expose RESTful endpoints for mobile app communication.
- **In-Memory Database (H2)**: Utilizes an H2 in-memory database for data persistence.
- **Input Validation**: Ensures data integrity with Spring Boot validation annotations.
- **Exception Handling**: Includes global exception handling to manage errors and invalid requests.
- **Object-Oriented Design**: Implemented using best practices for object-oriented programming (OOP).

## Endpoints:
- **GET /api/waste-categories/{id}**: Retrieve waste category by ID.
- **POST /api/waste-categories**: Create a new waste category.
- **PUT /api/waste-categories/{id}**: Update an existing waste category.
- **DELETE /api/waste-categories/{id}**: Delete a waste category.

## Technologies:
- **Spring Boot**
- **H2 Database (In-memory)**
- **JPA (Java Persistence API)**
- **Spring Validation**
