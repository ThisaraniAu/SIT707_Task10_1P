package ontrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnTrack {
    private WebDriver driver;

    public OnTrack() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
    }

    public void login(String username, String password) {
        driver.get("http://ontrack.deakin.edu.au/login");
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.className("btn-primary"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
    

    public void addTask(String taskName, String taskDescription) {
        driver.get("http://ontrack.deakin.edu.au/add-task");
        WebElement taskNameInput = driver.findElement(By.id("taskName"));
        WebElement taskDescriptionInput = driver.findElement(By.id("taskDescription"));
        WebElement submitButton = driver.findElement(By.className("btn-primary"));

        taskNameInput.sendKeys(taskName);
        taskDescriptionInput.sendKeys(taskDescription);
        submitButton.click();
    }

    public void logout() {
        // Implement logout functionality if needed
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) {
        OnTrack onTrack = new OnTrack();
        onTrack.login("your_username", "your_password");

        // Example usage:
        onTrack.addTask("New Task", "This is a new task.");

        // Perform other actions as needed

        onTrack.closeBrowser();
    }
}
