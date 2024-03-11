package com.example.assignment2.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrendyolTestCases {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATLAS\\Desktop\\chromedriver-win64");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Test Case 1: Login Functionality
        testLogin(driver);

        // Test Case 2: Product Search Functionality
        testProductSearch(driver);

        // Test Case 3: Checkout Process Functionality
        testCheckoutProcess(driver);

        // Close the browser
        driver.quit();
    }

    // Test Case 1: Login Functionality
    private static void testLogin(WebDriver driver) {
        // Open the Trendyol website
        driver.get("https://www.trendyol.com/");

        // Click on the login button
        WebElement loginButton = driver.findElement(By.cssSelector(".account-button"));
        loginButton.click();

        // Enter username and password
        WebElement usernameField = driver.findElement(By.id("email"));
        usernameField.sendKeys("your_username");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("your_password");

        // Click on the login button
        WebElement submitButton = driver.findElement(By.cssSelector(".submit"));
        submitButton.click();

        // Wait for the login process to complete and assert if the user is logged in successfully
        // Add your assertion logic here
    }

    // Test Case 2: Product Search Functionality
    private static void testProductSearch(WebDriver driver) {
        // Open the Trendyol website
        driver.get("https://www.trendyol.com/");

        // Enter the product name in the search box
        WebElement searchBox = driver.findElement(By.cssSelector(".search-box"));
        searchBox.sendKeys("your_product_name");

        // Click on the search button
        WebElement searchButton = driver.findElement(By.cssSelector(".search-icon"));
        searchButton.click();

        // Wait for the search results to load and assert if the correct products are displayed
        // Add your assertion logic here
    }

    // Test Case 3: Checkout Process Functionality
    private static void testCheckoutProcess(WebDriver driver) {
        // Open the Trendyol website
        driver.get("https://www.trendyol.com/");

        // Navigate to the checkout page
        // Add your logic to navigate to the checkout page

        // Proceed with the checkout process (e.g., adding items to cart, entering shipping details, etc.)
        // Add your checkout process logic here

        // Wait for the checkout process to complete and assert if the order is placed successfully
        // Add your assertion logic here
    }
}
