# Project README

## Overview

This project is designed to be run using Docker and Docker Compose. It includes a pre-built JAR file that will be copied into the `config/app` folder during the build process.

## Prerequisites

- Docker
- Docker Compose

## Instructions

1. **Clone the repository:**

    ```sh
    git clone https://github.com/nenodias/jmx-exemplo.git
    cd project
    ```

2. **Build the project using gradle:**

    ```sh
    ./gradlew build
    ```

3. **Move the jar into config/app folder:**

    ```sh
    mv ./build/libs/JMXExample-0.0.1-SNAPSHOT.jar config/app/app.jar

    ```
4. **Run the application:**

    ```sh
    docker-compose up
    ```

4. **Access the spring-boot-admin:**

    Open your web browser and navigate to `http://localhost:1111`.


