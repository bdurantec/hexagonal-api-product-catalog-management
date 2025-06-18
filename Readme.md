# 🧱 Product Catalog API — Hexagonal Architecture

**A minimal API project designed for local execution, focused on demonstrating Hexagonal Architecture principles in a
product catalog domain.**

---

## 🚀 Technologies Used

- Kotlin + Spring Boot
- Gradle
- Hexagonal (Ports & Adapters) Architecture
- H2 Database

---

## ⚙️ Features

- [x] Product registration and listing
- [x] Hexagonal architecture with domain isolation
- [x] Integration with h2database (via JPA/Hibernate)
- [x] RESTful endpoints with validation

---

## 🧪 Running Locally

### Prerequisites

- Java 21

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/bdurantec/hexagonal-api-product-catalog-management.git
cd product-catalog-management-api

# 2. Run Docker containers
docker-compose up --build

# 3. Access the API
```sh
# create
curl --request POST \
  --url http://localhost:8080/products \
  --header 'Content-Type: application/json' \
  --data '{
	    "name": "name-one",
        "description": "desc-one",
        "value": 100.00
}'

# get
curl --request GET --url http://localhost:8080/products/3b386770-67ce-453d-9761-18a5df719877
```
