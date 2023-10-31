package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void newChanelMin() {
        Radio radio = new Radio();
        radio.setNewChanel(0);
        int expected = 0;
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void newChanelMax() {
        Radio radio = new Radio();
        radio.setNewChanel(9);
        int expected = 9;
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChaneLessMin() {
        Radio radio = new Radio();
        radio.setNewChanel(-1);
        int expected = radio.getNewChanel();
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelMoreMax() {
        Radio radio = new Radio();
        radio.setNewChanel(10);
        int expected = radio.getNewChanel();
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void newChanel() {
        Radio radio = new Radio();
        radio.setNewChanel(7);
        int expected = 7;
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelAfterMin() {
        Radio radio = new Radio();
        radio.setNewChanel(0);
        int expected = 1;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextChanelTheMaximum() {
        Radio radio = new Radio();
        radio.setNewChanel(8);
        int expected = 9;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextAfterChanelMin() {
        Radio radio = new Radio();
        radio.setNewChanel(8);
        int expected = 9;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void nextAfterChanelMax() {
        Radio radio = new Radio();
        radio.setNewChanel(9);
        int expected = 0;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }


    @Test
    void nextChanelMoreMax1() {
        Radio radio = new Radio();
        radio.setNewChanel(10);
        int expected = 0;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);

    }

    @Test
    void prevChanelBorderMin() {
        Radio radio = new Radio();
        radio.setNewChanel(1);
        int expected = 0;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentMax() {
        Radio radio = new Radio();
        radio.setNewChanel(9);
        int expected = 8;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelLessMax() {
        Radio radio = new Radio();
        radio.setNewChanel(10);
        int expected = 9;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentMin() {
        Radio radio = new Radio();
        radio.setNewChanel(0);
        int expected = 1;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentBorderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 2;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 10;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeCurrentMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.addVolume();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentMin() {
        Radio radio = new Radio();
        radio.setNewChanel(0);
        int expected = 9;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanel() {
        Radio radio = new Radio();
        radio.setNewChanel(7);
        int expected = 6;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }


    @Test
    void downVolumeCurrentBorderMin() {
        Radio radio = new Radio();
        radio.setNewChanel(1);
        int expected = 0;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeLessMin() {
        Radio radio = new Radio();
        radio.setNewChanel(-1);
        int expected = 0;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 9;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 10;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void downVolumeMin() {
        Radio radio = new Radio();
        radio.setNewChanel(0);
        int expected = 0;
        int actual = radio.downVolume();
        assertEquals(expected, actual);
    }

    @Test
    void сurrentChannalMin() {
        Radio radio = new Radio();
        radio.setNewChanel(0);
        int expected = 0;
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void сurrentChannalMax() {
        Radio radio = new Radio();
        radio.setNewChanel(9);
        int expected = 9;
        int actual = radio.getNewChanel();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentChannelMax() {
        Radio radio = new Radio();
        radio.setNewChanel(8);

        radio.getNewChanel();

        int expected = 9;
        int actual = radio.nextChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanel1() {
        Radio radio = new Radio();
        radio.setNewChanel(0);
        int expected = 9;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

    @Test
    void prevChanelCurrentLessMin() {
        Radio radio = new Radio();
        radio.setNewChanel(-1);
        int expected = 0;
        int actual = radio.prevChanel();
        assertEquals(expected, actual);
    }

}