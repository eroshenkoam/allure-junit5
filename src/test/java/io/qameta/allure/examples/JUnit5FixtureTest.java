package io.qameta.allure.examples;

import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

public class JUnit5FixtureTest {

    @BeforeAll
    public static void beforeAll() {
        step("Step inside beforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        step("Step inside beforeEach");
    }

    @Test
    public void allureFixtureTest() {
        step("Step inside allureFixtureTest");
    }

    @AfterEach
    public void afterEach() {
        step("Step inside afterEach");
    }

    @AfterAll
    public static void afterAll() {
        step("Step inside afterAll");
    }

}
