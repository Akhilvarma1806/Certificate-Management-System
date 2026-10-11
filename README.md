# Certificate Management System

A RESTful backend application built with **Spring Boot** and **Spring Data JPA** to manage certificate records. It supports full CRUD operations (Create, Read, Update, Delete) and is configured to work with an Angular frontend running on `http://localhost:4200`.

---

## Features

- Add a new certificate record
- View all certificate records
- Update an existing certificate (year and college)
- Delete a certificate by ID
- CORS enabled for the Angular frontend

---

## Tech Stack

| Layer      | Technology                      |
|------------|---------------------------------|
| Language   | Java                            |
| Framework  | Spring Boot                     |
| Persistence| Spring Data JPA (Hibernate)     |
| Database   | SQL database (configure below)  |
| Build Tool | Maven                           |
| Frontend   | Angular (`localhost:4200`)      |

---

## Project Structure

```
com.alpha.certificate
├── controller
│   └── CertificateController.java   # REST endpoints
├── serivce
│   └── CertificateService.java      # Business logic
├── repository
│   └── CertificateRepo.java         # JPA repository
└── entity
    └── Certificate.java             # JPA entity
```

The application follows a layered architecture: **Controller → Service → Repository → Database**.

---

## Entity: `Certificate`

| Field      | Type      | Description                    |
|------------|-----------|--------------------------------|
| `cid`      | Integer   | Certificate ID (Primary Key)   |
| `cyear`    | Integer   | Year of the certificate        |
| `ccollege` | String    | College name                   |

---

## API Endpoints

| Method | Endpoint          | Description                       | Request Body        |
|--------|-------------------|-----------------------------------|---------------------|
| POST   | `/addc`           | Add a new certificate             | Certificate JSON    |
| GET    | `/getc`           | Get all certificates              | –                   |
| PUT    | `/updatec`        | Update a certificate (by `cid`)   | Certificate JSON    |
| DELETE | `/deletec/{cid}`  | Delete a certificate by ID        | –                   |

### Sample Request Body

```json
{
  "cid": 1,
  "cyear": 2026,
  "ccollege": "Kommuri Pratap Reddy Institute of Technology"
}
```

### Sample Response (`GET /getc`)

```json
[
  {
    "cid": 1,
    "cyear": 2026,
    "ccollege": "Kommuri Pratap Reddy Institute of Technology"
  }
]
```

---

## Getting Started

### Prerequisites

- JDK 17 or higher
- Maven
- A running SQL database (e.g., MySQL)
- Angular frontend (optional) running on port 4200

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/Akhilvarma1806/<your-repo-name>.git
   cd <your-repo-name>
   ```

2. **Configure the database** in `src/main/resources/application.properties`
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/<your_db_name>
   spring.datasource.username=<your_username>
   spring.datasource.password=<your_password>
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. The server starts at `http://localhost:8080`.

---

## Testing the APIs

Use Postman or any REST client:

```bash
# Add
curl -X POST http://localhost:8080/addc \
  -H "Content-Type: application/json" \
  -d '{"cid":1,"cyear":2026,"ccollege":"ABC College"}'

# Get all
curl http://localhost:8080/getc

# Update
curl -X PUT http://localhost:8080/updatec \
  -H "Content-Type: application/json" \
  -d '{"cid":1,"cyear":2025,"ccollege":"XYZ College"}'

# Delete
curl -X DELETE http://localhost:8080/deletec/1
```

---

## Future Improvements

- Add input validation and exception handling (e.g., return 404 when a certificate is not found)
- Auto-generate IDs with `@GeneratedValue`
- Add pagination and search
- Add unit tests for the service and controller layers

---

## Author

**Akhil Varma Mudunuri**
GitHub: [Akhilvarma1806](https://github.com/Akhilvarma1806)
