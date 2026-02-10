# E-commerce Product Management REST API

## Overview
This project is a simple Spring Boot backend application that provides RESTful APIs to manage e-commerce products. It is a backend-only service that exposes JSON-based APIs and does not include any graphical user interface.

The APIs can be consumed by any frontend application, mobile app, or API client such as Postman.

---

## Project Structure
The Spring Boot application is located inside the `ecommerce` folder.

ecommerce-product-api
└── ecommerce
    ├── src
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    └── HELP.md

---

## Features
- Add a new product
- Retrieve product details by ID
- RESTful API design
- In-memory data storage using ArrayList
- JSON request and response handling

---

## Product Model
Each product contains the following fields:
- id (int)
- name (String)
- description (String)
- price (double)
- quantity (int)

---

## API Endpoints

### Add Product
Method: POST  
URL: /products  

Sample Request Body:
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop",
  "price": 55000,
  "quantity": 3
}

---

### Get Product by ID
Method: GET  
URL: /products/{id}

Example:
http://localhost:8081/products/1

Sample Response:
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop",
  "price": 55000,
  "quantity": 3
}

---

## How to Run the Application
1. Open the project in IntelliJ IDEA or Eclipse
2. Navigate to the ecommerce folder
3. Run EcommerceApplication.java
4. The server will start on port 8081
5. Test the APIs using Postman or browser for GET requests

---

## Notes
- This is a backend-only REST API
- No UI is implemented intentionally
- Data is stored in memory and resets when the application restarts

---

## Author
Dipali Mali
