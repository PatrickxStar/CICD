# CI/CD Workflow Documentation

## Purpose
This document describes the CI/CD workflows implemented for this project using GitHub Actions.

## CI Workflow
- Triggers on every push to the `main` branch.
- Steps include:
    1. Checkout code.
    2. Set up JDK 22.
    3. Install dependencies using `mvn install`.
    4. Run tests using `mvn test`.
    5. Package the application using `mvn package`.

## CD Workflow
- Triggers after successful CI build.
- Deploys the application to an Ubuntu server using SSH.

## Configuration
- SSH key is stored in GitHub Secrets as `SSH_PRIVATE_KEY`.
- The app is deployed to Ubuntu server at `your-ubuntu-server-ip`.

## Screenshots
![CI Workflow](./ci-workflow.png)
![CD Workflow](./cd-workflow.png)
# CICD
