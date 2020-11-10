package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TV tv1 = new TV();
        tv1.setChannel(2);
        tv1.turnOn();
        tv1.setChannel(4);
        tv1.channelDown();
        tv1.channelUp();
        tv1.setChannel(7);
        tv1.channelUp();
        tv1.channelDown();
    }
}
