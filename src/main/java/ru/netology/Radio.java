package ru.netology;

public class Radio {

    private int currentChanel;
    private int totalChanel = 10;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int totalChanel) {
        this.totalChanel = totalChanel;
    }

    public int getNewChanel() {
        return currentChanel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > (totalChanel - 1)) {
            return;
        }
        if (currentChannel < 0) {
            return;
        }
        this.currentChanel = currentChannel;
    }

    public int getCurrentChannel() {
        return currentChanel;
    }
    public int getTotalChanel() {
        return totalChanel;
    }
    public void increaseChannel() {

        if (currentChanel == (totalChanel - 1)) {
            setCurrentChannel(0);
            return;
        }
        setCurrentChannel(++currentChanel);

    }
    public void prevChannel() {
        if (currentChanel == 0) {
            setCurrentChannel(totalChanel - 1);
            return;
        }
        setCurrentChannel(--currentChanel);

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.currentVolume = volume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }
    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
