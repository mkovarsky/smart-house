package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increaseVolumeFromNormalValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setMaxVolume(10);
        assertEquals(6, radio.increaseVolume());
    }

    @Test
    void increaseVolumeFromMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setMaxVolume(10);
        assertEquals(10, radio.increaseVolume());
    }

    @Test
    void decreaseVolumeFromNormalValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setMinVolume(0);
        assertEquals(3, radio.decreaseVolume());

    }

    @Test
    void decreaseVolumeFromMinValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMinVolume(0);
        assertEquals(0, radio.decreaseVolume());
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
        assertEquals(8, radio.changeStationByNextButton());
    }

    @Test
    void changeStationByNextButtonFromMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setMaxStation(9);
        radio.setMinStation(0);
        assertEquals(0, radio.changeStationByNextButton());
    }

    @Test
    void changeStationByPervButtonFromNormalValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.setMinStation(0);
        assertEquals(2, radio.changeStationByPervButton());
    }

    @Test
    void changeStationByPervButtonFromMinValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setMinStation(0);
        radio.setMaxStation(9);
        assertEquals(9, radio.changeStationByPervButton());
    }
}
