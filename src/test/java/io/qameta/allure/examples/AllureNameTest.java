package io.qameta.allure.examples;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllureNameTest {

    @Test
    @DisplayName("Static name")
    public void annotationNameTest() {
    }

    @Test
    public void dynamicNameTest() {
        final String dynamicPart = "dynamic parameter";
        final String dynamicName = String.format("Test with parameter [%s]", dynamicPart);
        Allure.getLifecycle().updateTestCase(result -> result.setName(dynamicName));
    }

}
