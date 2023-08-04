package com.example.gradletime;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class ThingToTestTest {

    private ThingToTest thingToTest = new ThingToTest();

    @Test
    public void test() {
        boolean unTrue = thingToTest.testMe();
        assertFalse(unTrue);
    }


}