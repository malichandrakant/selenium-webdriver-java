# Selenium ID Locator Practice

## Project Description

This project demonstrates how to use the **ID locator** in Selenium WebDriver with Java. It automates the login process on the SauceDemo website by locating the username, password, and login button using their unique `id` attributes.

## Technologies Used

* Java
* Selenium WebDriver
* Eclipse IDE
* Chrome Browser
* ChromeDriver

## Website Used

https://www.saucedemo.com/

## Test Scenario

1. Launch Chrome browser.
2. Open the SauceDemo website.
3. Enter the username using the **ID** locator.
4. Enter the password using the **ID** locator.
5. Click the **Login** button using the **ID** locator.
6. Verify that the login is successful.
7. Close the browser.

## Locators Used

| Element      | Locator Type | Locator Value  |
| ------------ | ------------ | -------------- |
| Username     | ID           | `user-name`    |
| Password     | ID           | `password`     |
| Login Button | ID           | `login-button` |

## Expected Output

The application logs in successfully and displays the products page.

## Learning Outcome

* Understand how to locate web elements using `By.id()`.
* Practice basic Selenium WebDriver commands.
* Learn browser launch, element interaction, and browser closure.
