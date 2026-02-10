# 🛒 E-Commerce Product API

A simple **Spring Boot REST API** for managing e-commerce products.  
This project is beginner-friendly and focuses on understanding REST APIs, request/response handling, and basic backend concepts.

---

## 📌 Project Overview

This application provides REST endpoints to:
- Add a new product
- Retrieve product details by ID
- Work with JSON request and response
- Store data in memory (no database)

The goal of this project is **learning and clarity**, not production use.

---

## 📂 Project Structure

The Spring Boot application is located inside the **`ecommerce`** folder.

```
ecommerce-product-api
└── ecommerce
    ├── src
    │   └── main
    │       ├── java
    │       │   └── com.example.ecommerce
    │       │       ├── EcommerceApplication.java
    │       │       ├── controller
    │       │       │   └── ProductController.java
    │       │       └── model
    │       │           └── Product.java
    │       └── resources
    │           └── application.properties
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    └── HELP.md
```

---

## ✨ Features

- Add a new product
- Retrieve product details by ID
- RESTful API design
- In-memory data storage using `ArrayList`
- JSON request and response handling
- Simple and easy-to-understand structure

---

## 📦 Product Model

Each product contains the following fields:

| Field       | Type   |
|------------|--------|
| id         | int    |
| name       | String |
| description| String |
| price      | double |
| quantity   | int    |

---

## 🔗 API Endpoints

### ➕ Add Product

- **Method:** `POST`
- **URL:** `/products`

**Sample Request Body (JSON):**
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop",
  "price": 55000,
  "quantity": 3
}
```

**Response:**
```
Product added successfully
```

---

### 🔍 Get Product by ID

- **Method:** `GET`
- **URL:** `/products/{id}`

**Example:**
```
http://localhost:8081/products/1
```

**Sample Response (JSON):**
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop",
  "price": 55000,
  "quantity": 3
}
```

---

## ▶️ How to Run the Application

1. Open the project in **IntelliJ IDEA** or **Eclipse**
2. Navigate to the **`ecommerce`** folder
3. Open `EcommerceApplication.java`
4. Run the application
5. The server will start on **port 8081**
6. Test APIs using **Postman** or browser (for GET requests)

---

## 🌐 Local URLs

- Application base URL:
```
http://localhost:8081
```

- Example API:
```
http://localhost:8081/products/1
```

> Seeing a **Whitelabel Error Page** at `/` is normal because no UI is defined.

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Maven
- REST API
- JSON

---

## 🚀 Future Enhancements

- Add database (MySQL / PostgreSQL)
- Implement CRUD operations (Update & Delete)
- Add validation and exception handling
- Create frontend UI
- Add Swagger API documentation

---

## 👩‍💻 Author

**Dipali Mali**  
GitHub: https://github.com/dipalimali213

---

⭐ If you find this project helpful, consider giving it a star!
