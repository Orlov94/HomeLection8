package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void setTotalChanel() {
        Radio radio = new Radio(30);

        assertEquals(30, radio.getTotalChanel());
    }

    @Test
    void setCurrentChanelTotalOver() {
        Radio radio = new Radio(50);

        radio.setCurrentChannel(30);

        assertEquals(30, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChanelTotalOver2() {
        Radio radio = new Radio(50);

        radio.setCurrentChannel(60);

        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void setCurrentChanelTotalBelow() {
        Radio radio = new Radio(50);

        radio.setCurrentChannel(-1);

        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void setNextChanelTotal() {
        Radio radio = new Radio(50);

        radio.setCurrentChannel(23);
        radio.increaseChannel();

        assertEquals(24, radio.getCurrentChannel());
    }

    @Test
    void setNextChanelTotalOverMax() {
        Radio radio = new Radio(50);

        radio.setCurrentChannel(49);
        radio.increaseChannel();

        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void setPrevChannelTotal() {
        Radio radio = new Radio(40);

        radio.setCurrentChannel(24);
        radio.prevChannel();

        assertEquals(23, radio.getCurrentChannel());
    }

    @Test
    void setPrevChanelTotalBelowMin() {
        Radio radio = new Radio(30);

        radio.setCurrentChannel(0);
        radio.prevChannel();

        assertEquals(29, radio.getCurrentChannel());
    }

    @Test
    void setPrevChaneDefaultTotal() {
        Radio radio = new Radio();

        radio.setCurrentChannel(0);
        radio.prevChannel();

        assertEquals(9, radio.getCurrentChannel());

    }

    @Test
    void setNextChannelDefaultTotal() {
        Radio radio = new Radio();

        radio.setCurrentChannel(9);
        radio.increaseChannel();

        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void maxVolumeIncrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.prevVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void prevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.prevVolume();

        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeOverMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void volumeIncreaseMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    void getCurrentChannel1() {
        Radio radio = new Radio();

        radio.setCurrentChannel(8);
        radio.getNewChanel();


        assertEquals(8, radio.getCurrentChannel());
    }

    @Test
    public void currentVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }
}

