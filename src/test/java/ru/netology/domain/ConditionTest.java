package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    @Test
    void increaseCurrentTemperatureFromNormalValue() {
        Condition condition = new Condition();
        condition.setCurrentTemperature(20);
        condition.setMaxTemperature(30);
        condition.increaseCurrentTemperature();
        assertEquals(condition.getMaxTemperature(),condition.getCurrentTemperature());
    }

    @Test
    void increaseCurrentTemperatureFromMaxValue() {
        Condition condition = new Condition();
        condition.setCurrentTemperature(30);
        condition.setMaxTemperature(30);
        condition.increaseCurrentTemperature();
        assertEquals(condition.getMaxTemperature(),condition.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureFromNormalValue() {
        Condition condition = new Condition();
        condition.setCurrentTemperature(20);
        condition.setMinTemperature(16);
        condition.decreaseCurrentTemperature();
        assertEquals(condition.getMinTemperature(),condition.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperatureFromMinValue() {
        Condition condition = new Condition();
        condition.setCurrentTemperature(16);
        condition.setMinTemperature(16);
        condition.decreaseCurrentTemperature();
        assertEquals(condition.getMinTemperature(),condition.getCurrentTemperature());
    }
}