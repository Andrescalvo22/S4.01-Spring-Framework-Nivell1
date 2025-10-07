# 📄 Description

In this exercise the goal is to create a simple REST API with two endpoints that return personalized greeting messages. The first endpoint using `RequestParam`and the second one using `PathVariable`.
The exercise also includes basic Maven commands to compile, package, clean, and run the application, helping to practice working with Maven projects and Spring Boot applications.

Endpoints:
- `/HelloWorld` → RequestParam `name` (default: UNKNOWN)
- `/HelloWorld2/{name}` → PathVariable `name` (optional)

---

# 💻 Technologies

-Java 17
-Spring Boot 3.5.6
-Maven 3.9.11

---

# 📋 Requirements

- JDK 17+  
- Maven installed  
- Internet access for dependencies

---

# 🛠️ Installation

```bash
git clone <REPOSITORY_URL>
cd S04T01N01/S04T01N01
mvn compile
```
---

# ▶️ Run
```bash
mvn spring-boot:run
```
-Then, test the endpoints:
-http://localhost:9000/HelloWorld
-http://localhost:9000/HelloWorld?name=(Your name)
-http://localhost:9000/HelloWorld2
-http://localhost:9000/HelloWorld2/(Your name)

---

# 🌐 Deployment
```bash
mvn package
java -jar target/S04T01N01-0.0.1-SNAPSHOT.jar
```
---

# 🤝 Contributions
Contributions are welcome: Fork + branch + pull request with a clear description of your changes.




