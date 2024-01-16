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
@Epic("Test Portal")
@Feature("Portal Reachable")
public class NextTest
{
    String actualText = "Hello Portal";

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    @Story("Portal Exist")
    @Description("Portal Description")
    void testGet() {
        assertEquals("Hello JUnit 5", actualText);
    }

}
