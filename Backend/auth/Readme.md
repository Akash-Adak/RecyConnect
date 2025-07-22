# Auth Service – RecyConnect 

This is the **authentication microservice** responsible for user registration, login, and JWT token generation for the RecyConnect or Banking Management System. It is built with Spring Boot 3.5+, Spring Security, and MySQL.

---

## 🔐 Features

- ✅ User registration with hashed passwords
- ✅ Login with username/password
- ✅ JWT token generation (HMAC SHA-256)
- ✅ Token validation and security filter
- ✅ Dockerized and MySQL-ready
- ✅ Easy integration with other microservices

---

## 📦 Tech Stack

- Java 21
- Spring Boot 3.5.3
- Spring Security
- JWT (io.jsonwebtoken JJWT)
- MySQL (via Docker or external DB)
- Maven
- Docker

---

## 🧠 Endpoints

| Endpoint           | Method | Description           | Auth Required |
|--------------------|--------|------------------------|---------------|
| `localhost:9091/api/auth/register` | POST   | Register a new user     | ❌ No          |
| `localhost:9081/api/auth/login`    | POST   | Login and get JWT token | ❌ No          |

---

## 🔧 Setup & Run

### 🔁 Prerequisites

- JDK 21+
- Maven
- Docker (optional but recommended)
- MySQL running on `authdb`

