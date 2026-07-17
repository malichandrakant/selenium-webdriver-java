# Selenium LinkText and PartialLinkText Locator Practice

## Project Description

This project demonstrates Selenium WebDriver **LinkText** and **PartialLinkText** locator usage with Java.

The purpose of this practice is to understand how Selenium identifies and clicks hyperlink (`<a>` tag) elements using visible text.

## Technologies Used

* Java
* Selenium WebDriver 4
* Eclipse IDE
* Chrome Browser
* ChromeDriver

---

# Practical 1: LinkText Locator

## Test Scenario

Verify that Selenium can click a hyperlink using the complete visible link text.

## Application Used

Website:

```
https://the-internet.herokuapp.com/
```

## Automation Flow

1. Launch Chrome browser.
2. Open The Internet application.
3. Locate the "A/B Testing" hyperlink.
4. Click the link using `linkText`.
5. Verify navigation.
6. Close browser.

## Locator Used

HTML:

```html
<a href="/abtest">A/B Testing</a>
```

Selenium:

```java
driver.findElement(By.linkText("A/B Testing")).click();
```

## Learning

`linkText` searches for the exact visible text of a hyperlink.

Example:

```
Link text:
A/B Testing

Locator:
By.linkText("A/B Testing")
```

---

# Practical 2: PartialLinkText Locator

## Test Scenario

Verify that Selenium can click a hyperlink using partial visible text.

## Application Used

Website:

```
https://opensource-demo.orangehrmlive.com/
```

## Automation Flow

1. Launch Chrome browser.
2. Open OrangeHRM login page.
3. Find the "Forgot your password?" link.
4. Click the link using `partialLinkText`.
5. Verify password reset page.
6. Close browser.

## Locator Used

HTML:

```html
<a href="/auth/requestPasswordResetCode">
Forgot your password?
</a>
```

Selenium:

```java
driver.findElement(By.partialLinkText("Forgot")).click();
```

## Learning

`partialLinkText` searches for a part of the visible hyperlink text.

Example:

```
Complete link text:
Forgot your password?

Partial text:
Forgot

Locator:
By.partialLinkText("Forgot")
```

---

# Difference Between LinkText and PartialLinkText

| LinkText                              | PartialLinkText                         |
| ------------------------------------- | --------------------------------------- |
| Finds complete link text              | Finds part of link text                 |
| Exact match required                  | Partial match allowed                   |
| Less flexible                         | More flexible                           |
| Example: `By.linkText("A/B Testing")` | Example: `By.partialLinkText("Forgot")` |

---

# Real Automation Use Cases

## LinkText Examples

* Clicking Login links
* Opening Help pages
* Navigating menu options
* Clicking Account links

Example:

```
Logout
My Account
Contact Us
```

---

## PartialLinkText Examples

* Clicking links where text changes slightly
* Handling dynamic link names
* Finding long hyperlink text

Example:

Before:

```
Forgot your password?
```

After:

```
Forgot your login password?
```

Locator:

```java
By.partialLinkText("Forgot")
```

Works in both cases.

---

# Key Learning Outcomes

After completing this practice, you should understand:

* How Selenium identifies hyperlink elements.
* Difference between exact and partial text matching.
* How to use:

  * `By.linkText()`
  * `By.partialLinkText()`
* How to automate navigation actions.
* How locators are used in real Selenium projects.

---

# Git Commit Message

```
feat: add Selenium linkText and partialLinkText locator examples
```

# Commit Description

```
Added Selenium WebDriver examples demonstrating linkText and partialLinkText locators. Included practical automation scenarios for hyperlink identification and navigation using Java.
```
