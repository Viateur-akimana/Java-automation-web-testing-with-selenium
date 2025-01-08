# Selenium DemoQA Automation

This project is a Selenium-based automation framework for testing the DemoQA and saucedemo website. It uses Java, Spring Boot, and Maven for building and managing dependencies.

## Description

Selenium with Java using Page Object Model and master the art of automated web testing. Selenium is a powerful tool for automating web browsers, enabling you to simulate user interactions and verify web application functionality.

## Project Structure

- `src/main/java/com/viateur/selenium/demoqa/` - Contains the main page object classes and utilities.
- `src/test/java/com/viateur/selenium/demoqa/` - Contains the test classes for DemoQA.
- `src/test/java/com/viateur/selenium/saucedemo/` - Contains the test classes for SauceDemo.
- `src/test/java/com/viateur/selenium/demoqa/` - Contains the base test class.
- `src/main/java/utilities/` - Contains utility classes.

## Prerequisites

- Java 11 or higher
- Maven 3.6.3 or higher
- ChromeDriver (ensure it matches your Chrome browser version)

## Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/Viateur-akimana/Java-automation-web-testing-with-selenium.git
    cd selenium-demoqa
    ```

2. Install dependencies:
    ```sh
    mvn clean install
    ```

3. Update the `chromedriver` path in your environment variables or place it in the project root.

## Running Tests

To run all tests, use the following command:
```sh
mvn test
