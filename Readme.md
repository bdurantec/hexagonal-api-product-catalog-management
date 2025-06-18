# Product Catalog API — Hexagonal Architecture

**A minimal API project designed for local execution, focused on demonstrating Hexagonal Architecture principles in a
product catalog domain.**

---

## Technologies Used

- Kotlin + Spring Boot
- Gradle
- Hexagonal (Ports & Adapters) Architecture
- H2 Database

---

## Running Locally

### Prerequisites

- Java 21
- Docker

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/bdurantec/hexagonal-api-product-catalog-management.git
cd hexagonal-api-product-catalog-management

# 2. Run Docker containers
docker-compose up -d --build

# 3. Access the API
```sh
# create
curl --request POST \
  --url http://localhost:8080/products \
  --header 'Content-Type: application/json' \
  --data '{
	    "name": "product name",
        "description": "simple product to create",
        "value": 100.00
}'

# get
curl --request GET --url http://localhost:8080/products/:id # from post response
```
