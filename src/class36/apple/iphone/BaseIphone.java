package class36.apple.iphone;

import class36.apple.Charger;
import class36.apple.Locker;

import javax.annotation.processing.Messager;

public abstract class BaseIphone  implements Charger, Locker, Messager {

    private int batteryLevel;
    private String messageText;
    private boolean isLocked;
    private String lastMessage;

    BaseIphone(int bateryLevel, String messageText, boolean isLocked){
        this.batteryLevel = bateryLevel;
        this.messageText = messageText;
        this.isLocked = false;
    }




    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
        this.lastMessage = lastMessage;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {

        isLocked = locked;
    }

    @Override
    public void chargeBattery() {
        batteryLevel++;
    }

    public void sendMessage(String text) {
        messageText= text;
    }

    public void readMessage() {
        System.out.println(messageText);
    }

    @Override
    public void lock() {
        System.out.println("Locked");
    }


}

