# Overview
This repository contains a Eureka Server used for service discovery in a microservices architecture. 
It runs a registry on port 8761 by default and exposes a simple actuator health endpoint.

### Tech stack
- Language: Java 25 (Temurin)
- Frameworks/Libraries: Spring Boot 3.5.x, Spring Cloud 2025.0.x, Netflix Eureka Server
- Build tool: Gradle
- Testing: JUnit Platform via spring-boot-starter-test
- Code coverage: JaCoCo
- Containerization: Docker
- CI: GitHub Actions

# Requirements
- [JDK 25](https://www.oracle.com/java/technologies/downloads/#jdk25-linux)
- Docker
- Gradle

# Getting started

1) Clone the repo
```shell
  git clone https://github.com/Milozap/tec-eureka-server
  cd tec-eureka-server
```

2) Build the project
```shell
  ./gradlew clean build
```

3) Run the application
```shell
  ./gradlew bootRun
```

4) Access the Eureka dashboard
- http://localhost:8761

### Docker

Build image:
```shell
  docker build -t eureka-server:local .
```

Run container:
```shell
docker run -p 8761:8761 --name eureka-server eureka-server:local
```

### GitHub Actions (CI)

- The workflow .github/workflows/ci.yml:
  - Builds with Java 25 and Gradle
  - Runs tests and generates JaCoCo coverage
  - Uploads test reports on failure
  - Builds and (on non-PR events) pushes a Docker image to GitHub Container Registry (ghcr.io/milozap/tec-eureka-server)
