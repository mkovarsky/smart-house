package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increaseVolumeFromNormalValue() {
        Radio radio = new Radio(5, 10, 0, 5, 100, 0);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeFromMaxValue() {
        Radio radio = new Radio(5, 10, 0, 100, 100, 0);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeFromNormalValue() {
        Radio radio = new Radio(5, 10, 0, 50, 100, 0);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeFromMinValue() {
        Radio radio = new Radio(5, 10, 0, 0, 100, 0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void changeValidStationByNumericKeyPad() {
        Radio radio = new Radio();
        radio.changeStationByNumericKeyPad(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void changeStationAboveMaxByNumericKeyPad() {
        Radio radio = new Radio();
        radio.changeStationByNumericKeyPad(30);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void changeStationByNextButtonFromNormalValue() {
        Radio radio = new Radio(8, 10, 0, 60, 100, 0);
        radio.changeStationByNextButton();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void changeStationByNextButtonFromMaxValue() {
        Radio radio = new Radio(10, 10, 0, 60, 100, 0);
        radio.changeStationByNextButton();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void changeStationByPervButtonFromNormalValue() {
        Radio radio = new Radio(3, 10, 0, 60, 100, 0);
        radio.changeStationByPervButton();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void changeStationByPervButtonFromMinValue() {
        Radio radio = new Radio(0, 10, 0, 60, 100, 0);

        radio.changeStationByPervButton();
        assertEquals(10, radio.getCurrentStation());
    }
}
