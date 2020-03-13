package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

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

    public int increaseVolume() {
        if (currentVolume == maxVolume) {
            return currentVolume;
        } else {
            currentVolume += 1;
            return currentVolume;
        }
    }

    public int decreaseVolume() {
        if (currentVolume == minVolume) {
            return currentVolume;
        } else {
            currentVolume -= 1;
            return currentVolume;
        }
    }

    public int changeStationByNumericKeyPad(int selectedStation){
        currentStation = selectedStation;
        return currentStation;
    }

    public int changeStationByNextButton() {
        if (currentStation == maxStation) {
            return minStation;
        } else {
            currentStation += 1;
            return currentStation;
        }
    }

    public int changeStationByPervButton() {
        if (currentStation == minStation) {
            return maxStation;
        } else {
            currentStation -= 1;
            return currentStation;
        }
    }

}