package ru.netology.domain;

public class Radio {
    private int currentStation = 5;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;

    //Костурктор без аргументов
    public Radio() {

    }

    //Конструктор со всеми аргументами
    public Radio(int currentStation, int maxStation, int minStation, int currentVolume, int maxVolume, int minVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

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
        if (selectedStation > maxStation)  {
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