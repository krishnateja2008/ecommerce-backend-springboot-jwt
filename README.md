# 🛒 E-Commerce Backend | Spring Boot + JWT Authentication

A secure and scalable **E-Commerce Backend Application** built using **Java & Spring Boot**, featuring **JWT-based authentication**, **role-based authorization**, and **product management APIs**.

🔗 Built and maintained by *Krishnavidhya*  

---

## 🚀 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Security**
- **JWT Authentication**
- **BCrypt Password Encoder**
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **Postman**
- **Git & GitHub**

---

## ✅ Key Features

🔐 **Authentication & Security**
- User Registration with encrypted passwords using **BCrypt**
- User Login with **JWT Token Generation**
- Secure APIs using **JWT Filter**
- Token-based access for all protected endpoints

📦 **Product Management**
- Add new products
- View all products
- Update product details
- Delete products
- Search products by name & category

🛡️ **Authorization**
- Only authenticated users can access `/api/products/**`
- JWT security applied across all secured APIs

⚙️ **Backend Architecture**
- Controller → Service → Repository layered structure
- Clean REST API design
- Centralized configuration and exception handling

---

## 📂 Project Structure

```text
src/
 └── main/
     ├── java/com/skt/ecommerce
     │   ├── controller
     │   ├── service
     │   ├── service/impl
     │   ├── repository
     │   ├── entity
     │   ├── security
     │   └── EcommerceBackendApplication.java
     └── resources/
         └── application.properties
