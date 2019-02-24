package com.javaguru.lessons.lesson5;

class TV {

    private int currentVolume;
    private int currentChannel;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void increaseVolume() {
        currentVolume++;
    }

    public void decreaseVolume() {
        currentVolume--;
    }

    public void nextChannel() {
        currentChannel++;
    }

    public void previousChannel() {
        currentChannel--;
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentVolume=" + currentVolume +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
