package ru.netology.domain;

public class Radio {
// Требования к работе с радиостанциями:

    int currentRadioStation;

    public int getCurrentRadioStation() {
        if (currentRadioStation < 0) {
            return 0;
        }
        if (currentRadioStation > 9) {
            return 0;
        }
        return currentRadioStation;
    }

    public int nextCurrentRadioStation() {
        if (currentRadioStation >= 0 && currentRadioStation < 9) {
            return currentRadioStation += 1;
        }
        if (currentRadioStation >= 9) {
            return currentRadioStation = 0;
        }
        return nextCurrentRadioStation();
    }

    public int prevRadioStation() {
        if (currentRadioStation > 0 && currentRadioStation <= 9) {
            return currentRadioStation -= 1;
        }
        if (currentRadioStation == 0) {
            return currentRadioStation = 9;
        }
        return prevRadioStation();
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    // Требования к работе с громкостью радио:

    int currentRadioVolume;

    public int getCurrentRadioVolume() {
        if (currentRadioVolume < 0) {
            return 0;
        }
        if (currentRadioVolume > 10) {
            return 0;
        }
        return currentRadioVolume;
    }

    public int increaseVolume() {
        if (currentRadioVolume >= 0 && currentRadioVolume < 10) {
            return currentRadioVolume += 1;
        }
        if (currentRadioVolume >= 10) {
            return currentRadioVolume = 10;
        }
        return increaseVolume();
    }

    public int reduceVolume() {
        if (currentRadioVolume > 0 && currentRadioVolume <= 10) {
            return currentRadioVolume -= 1;
        }
        if (currentRadioVolume == 0) {
            return currentRadioVolume = 0;
        }
        return reduceVolume();
    }
}
