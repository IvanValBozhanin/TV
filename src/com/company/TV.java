package com.company;

public class TV {
    private int channel;
    private int volume;
    private boolean on;

    public TV() {
        this.volume = 3;
        this.channel = 1;
    }

    public void volumeUp() {
        if (isOn()) {
            if (getVolume() < 7) {
                setVolume(getVolume() + 1);
            } else {
                System.out.println("Volume already reached maximum!");
            }
        } else {
            System.out.println("TV is off!");
        }
    }

    public void volumeDown() {
        if (isOn()) {
            if (getVolume() > 1) {
                setVolume(getVolume() - 1);
            } else {
                System.out.println("Volume already reached minimum!");
            }
        } else {
            System.out.println("TV is off!");
        }
    }

    public void channelUp() {
        if (isOn()) {
            if (getChannel() < 120) {
                setChannel(getChannel() + 1);
            } else {
                System.out.println("Already reached channel maximum!");
            }
        } else {
            System.out.println("TV is off!");
        }
    }

    public void channelDown() {
        if (isOn()) {
            if (getChannel() > 1) {
                setChannel(getChannel() - 1);
            } else {
                System.out.println("Already reached channel minimum!");
            }
        } else {
            System.out.println("TV is off!");
        }
    }

    public void turnOn() {
        if (isOn()) {
            System.out.println("It is already on!");
        } else {
            setOn(true);
            System.out.println("TV is turned on!");
        }
    }

    public void turnOff() {
        if (!isOn()) {
            System.out.println("It is already off!");
        } else {
            setOn(false);
            System.out.println("TV is turned off!");
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (isOn()) {
            if (channel > 0 && channel < 121) {
                this.channel = channel;
                System.out.println("Current channel: " + getChannel());
            } else {
                System.out.println("Channel range is between 1 and 120 inclusive!");
            }
        } else {
            System.out.println("TV is off!");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (isOn()) {
            if (channel > 0 && channel < 8) {
                this.volume = volume;
                System.out.println("Current volume: " + getVolume());
            } else {
                System.out.println("Volume range is be between 1 and 8 inclusive!");
            }
        } else {
            System.out.println("TV is off!");
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
