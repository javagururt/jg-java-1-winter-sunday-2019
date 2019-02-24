package com.javaguru.lessons.lesson5;

class TVController {

    private TV tv;

    public void setTV(TV tv) {
        this.tv = tv;
    }

    public void increaseChannelButton() {
        tv.nextChannel();
    }
}
