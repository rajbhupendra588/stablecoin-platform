# Stablecoin Platform

Enterprise-grade B2B stablecoin settlement platform for commercial payments, invoice-driven payouts, treasury operations, and ledger reconciliation.

## Milestone 1 foundation

- Maven multi-module Spring Boot backend with a shared kernel and independently deployable services.
- Consistent service layout for controllers, domain code, DTOs, security, messaging, integrations, validation, and utilities.
- Local Docker stack for PostgreSQL, Redis, Kafka, Kafka UI, Prometheus, Grafana, Zipkin, and Mailhog.
- CI workflow scaffolding for build, tests, dependency checks, Docker validation, CodeQL, and releases.
- Baseline engineering standards for Spotless, Checkstyle, PMD, SpotBugs, JaCoCo, Maven Enforcer, OWASP Dependency Check, Lombok, and OpenRewrite.

## Build

```bash
mvn -B -f backend/pom.xml verify
```

## Local development

```bash
docker compose up -d
```

Service health endpoints follow `/api/v1/health`. Secrets must be provided through environment variables or a secret manager and must not be committed.
