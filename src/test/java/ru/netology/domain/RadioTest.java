package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    // Тестирование работы радиостанции:
    @Test
    public void shouldGetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = -6;

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        System.out.println("Номер текущей (прослушиваемой) радиостанции: " + radio.getCurrentRadioStation());

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextCurrentRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 8;

        int expected = 9;
        int actual = radio.nextCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 1;

        int expected = 0;
        int actual = radio.prevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    // Тестирование работы уровня громкости радио:

    @Test
    public void shouldGetCurrentRadioVolume() {
        Radio radio = new Radio();
        radio.currentRadioVolume = 10;

        int expected = 10;
        int actual = radio.getCurrentRadioVolume();

        System.out.println("Текущий уровень громкости звука: " + radio.getCurrentRadioVolume());

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.currentRadioVolume = 13;

        int expected = 10;
        int actual = radio.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.currentRadioVolume = 10;

        int expected = 9;
        int actual = radio.reduceVolume();

        assertEquals(expected, actual);
    }
}