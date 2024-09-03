# Project jmx-example

## Overview

This project is designed to be run using Docker and Docker Compose. It includes a pre-built JAR file that will be copied into the `config/app` folder during the build process.

## Prerequisites

- Docker
- Docker Compose
- Sdkman

## Instructions

1. **Clone the repository:**

    ```sh
    git clone https://github.com/nenodias/jmx-exemplo.git
    cd project
    ```

2. **Install the sdk with sdkman:**

    https://sdkman.io/

    ```sh
    sdk env install
    ```

3. **Use the sdk env:**

    ```sh
    sdk env
    ```

4. **Build the project using gradle:**

    ```sh
    ./gradlew build
    ```

5. **Move the jar into config/app folder:**

    ```sh
    mv ./build/libs/JMXExample-0.0.1-SNAPSHOT.jar config/app/app.jar

    ```
6. **Run the application:**

    ```sh
    docker compose up
    ```

7. **Access the spring-boot-admin:**

    Open your web browser and navigate to `http://localhost:1111`.


