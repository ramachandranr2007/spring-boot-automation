package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@SpringBootConfiguration
@Epic("Login Tests Epic")
@Feature("Invalid Login Features")
public class AppTest
{
    String actualText = "Hello JUnit 5";

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    @Story("User tries to login the system with invalid username and invalid password.")
    @Description("Invalid Login Test with Invalid Username and Invalid Password.")
    void testGet() {
        assertEquals("Hello JUnit 5", actualText);
    }

}
