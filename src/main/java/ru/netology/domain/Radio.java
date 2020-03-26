package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Radio {
    private int currentStation = 5;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;
        }
    }

    public void changeStationByNumericKeyPad(int selectedStation) {
        if (selectedStation > maxStation) {
            return;
        } else {
            currentStation = selectedStation;
        }
    }

    public void changeStationByNextButton() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation += 1;
        }
    }

    public void changeStationByPervButton() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation -= 1;

        }
    }
}