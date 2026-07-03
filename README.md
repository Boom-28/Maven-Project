# 🧮 DevOps Calculator App
**Simple Java Calculator — Jenkins + GitHub + Maven CI/CD Pipeline Demo**
> PES University | BEST Internship | DevOps Lab Assignment

---

## 📁 Project Structure

```
java-calculator/
├── src/
│   ├── main/java/com/devops/calculator/
│   │   ├── Calculator.java       # Core calculator logic
│   │   └── Main.java             # CLI entry point
│   └── test/java/com/devops/calculator/
│       └── CalculatorTest.java   # JUnit 5 unit tests (14 tests)
├── pom.xml                       # Maven build configuration
├── Jenkinsfile                   # CI/CD pipeline definition
└── README.md
```

## ⚙️ Operations Supported

| Operation     | Method                  |
|---------------|-------------------------|
| Addition      | `add(a, b)`             |
| Subtraction   | `subtract(a, b)`        |
| Multiplication| `multiply(a, b)`        |
| Division      | `divide(a, b)`          |
| Modulus       | `modulus(a, b)`         |
| Power         | `power(base, exp)`      |
| Square Root   | `squareRoot(a)`         |

## 🚀 Build & Run Locally

```bash
# Clone the repo
git clone https://github.com/<your-username>/java-calculator.git
cd java-calculator

# Compile
mvn clean compile

# Run tests
mvn test

# Package as JAR
mvn clean package

# Run the JAR
java -jar target/calculator-1.0.0.jar
```

## 🔁 Jenkins CI/CD Pipeline Stages

```
Checkout → Build → Test → Package → Archive Artifacts
```

- **Checkout** — Pulls code from GitHub via webhook trigger
- **Build** — `mvn clean compile`
- **Test** — `mvn test` + publishes JUnit XML reports
- **Package** — `mvn package` → produces `calculator-1.0.0.jar`
- **Archive** — Stores JAR as Jenkins build artifact
- **Email** — Sends success/failure notification

## 📧 Email Notification
Configure Gmail SMTP in Jenkins:
- **SMTP server:** `smtp.gmail.com`
- **Port:** `465` (SSL)
- **Credentials:** Gmail App Password

---
*Built for the BEST DevOps Internship CI/CD lab.*

welcome to CI&CD
