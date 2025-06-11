# 🌿 Spring Boot Product Database App

A minimal Spring Boot 3 app built with Java 21, demonstrating RESTful API access and in-memory H2 database support using the entity `FraseInspiradora`.

---

## 🚀 Features

- Spring Boot 3.x
- REST API for managing products (or other entities)
- JPA with H2 (or configurable RDBMS like PostgreSQL/MySQL)
- H2 database console for browser-based DB inspection
- Maven-based build

---

## 📦 Tech Stack

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 / PostgreSQL / MySQL (configurable)
- Maven

---


## 🚀 Getting Started

### 1. Clone the repo

```bash
git clone https://github.com/vitaFlash/Mi-Primer-Proyecto-Spring-Boot.git
cd Mi-Primer-Proyecto-Spring-Boot
````

### 2. Build the project

```bash
./mvnw clean install
```

### 3. Run the app

```bash
./mvnw spring-boot:run
```

App will be available at:
**[http://localhost:8080](http://localhost:8080)**

---

## 🔧 Configuration (H2 + JPA)

Your `application.properties` already includes:

```properties
spring.application.name=demo

# H2 DATABASE
spring.datasource.url=jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true

# Init SQL
spring.jpa.defer-datasource-initialization=true
spring.sql.init.mode=always

# H2 Web Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

## 📂 API Endpoints

> All endpoints below are examples assuming your controller is mapped to `/frases`.

| Method | Endpoint       | Description                        |
| ------ | -------------- | ---------------------------------- |
| GET    | `/frases`      | Get all `FraseInspiradora` entries |
| GET    | `/frases/{id}` | Get one by ID                      |
| POST   | `/frases`      | Create a new phrase                |
| PUT    | `/frases/{id}` | Update a phrase                    |
| DELETE | `/frases/{id}` | Delete a phrase                    |

---

## 🗃️ H2 Database Console

To test the database in your browser:

1. Start the app
2. Go to:
   🔗 `http://localhost:8080/h2-console`
3. Use the following settings:

| Field    | Value                |
| -------- | -------------------- |
| JDBC URL | `jdbc:h2:mem:testdb` |
| Username | `sa`                 |
| Password | *(leave blank)*      |

---

## 📁 Project Structure

```
demo/
├── .idea/                     ← Configuración de IntelliJ
├── .mvn/                      ← Configuración de Maven Wrapper
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/com.fizzvibes.demo/
│   │   │   └── DemoApplication.java ← Clase principal
│   │   └── resources/
│   │       ├── static/        ← Archivos estáticos (CSS, JS, imágenes)
│   │       ├── templates/     ← Plantillas Thymeleaf (si usas frontend HTML)
│   │       └── application.properties ← Config. de Spring Boot
│   └── test/java/com.fizzvibes.demo/
│       └── DemoApplicationTests.java ← Clase de prueba generada
├── pom.xml                    ← Configuración del proyecto Maven
```

---

## 🧪 Example: curl Request

```bash
curl -X POST http://localhost:8080/frases \
     -H "Content-Type: application/json" \
     -d '{"texto": "Cree en ti mismo."}'
```

---

## 👤 Author

**vitaFlash**
🔗 GitHub: [@vitaFlash](https://github.com/vitaFlash)

---

## 📜 License

This project is open-source and available under the [MIT License](LICENSE).


