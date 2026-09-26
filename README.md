This project is a simplified learning implementation inspired by enterprise telecom provisioning architectures and backend engineering practices. It does not contain any proprietary business logic, confidential data, or internal implementation details from any organization.

Telecom Provisioning Simulator This project is designed for hands-on practice with:

Spring Boot Microservices REST APIs Service-to-service communication Logging & debugging JUnit & Mockito testing Spring Security Kafka event-driven communication Docker deployment Sonar code quality analysis Multithreading concepts Production-style troubleshooting

Project Goal The goal of this project is to simulate a telecom provisioning workflow system where network provisioning requests are processed through multiple backend services.

In this simplified implementation, workflows are simulated using hardcoded configurations to focus more on backend engineering concepts and production-style practices.

+------------------+ | Frontend | | (Angular/Postman)| +--------+---------+ | v +------------------+ | API Gateway | +--------+---------+ | ----------------------------------- | | | v v v +---------------+ +---------------+ +---------------+ | Order Service | | Workflow Svc | | Notification | +-------+-------+ +-------+-------+ +-------+-------+ | | | v | +------------------+ | | Network Service | | +------------------+ | v +------------------+ | PostgreSQL DB |
