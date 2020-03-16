package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increaseVolumeFromNormalValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setMaxVolume(10);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeFromMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setMaxVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeFromNormalValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setMinVolume(0);
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());

    }

    @Test
    void decreaseVolumeFromMinValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMinVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void changeStationByNumericKeyPad() {
        Radio radio = new Radio();
        radio.changeStationByNumericKeyPad(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void changeStationByNextButtonFromNormalValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.setMaxStation(9);
        radio.changeStationByNextButton();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void changeStationByNextButtonFromMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.changeStationByNextButton();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void changeStationByPervButtonFromNormalValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.setMinStation(0);
        radio.changeStationByPervButton();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void changeStationByPervButtonFromMinValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.changeStationByPervButton();
        assertEquals(9, radio.getCurrentStation());
    }
}
