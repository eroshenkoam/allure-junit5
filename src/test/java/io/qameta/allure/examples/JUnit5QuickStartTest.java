package io.qameta.allure.examples;

import io.qameta.allure.Step;
import io.qameta.allure.model.Status;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class JUnit5QuickStartTest {

    @Test
    @DisplayName("allureSimpleTest displayName")
    public void allureSimpleTest() {
        step("Simple step");
        step("Simple step with status", Status.FAILED);
        step("Simple lambda step", () -> {
            step("Simple step inside lambda step");
        });
        simpleMethodStep("method parameter");
    }

    @Step("Simple method with step annotation")
    public void simpleMethodStep(String param) {
        step("Method parameter: " + param);
        step("Simple step inside method");
    }

}
