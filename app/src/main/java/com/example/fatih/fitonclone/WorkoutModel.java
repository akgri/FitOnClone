package com.example.fatih.fitonclone;

public class WorkoutModel {
    private int imageResourceId;
    private String itemName;
    private int itemTime;
    private int itemIntensity;
    private String weekCurrent;

    public WorkoutModel() {
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public WorkoutModel(int imageResourceId, String itemName, int itemTime, int itemIntensity, String weekCurrent) {
        this.imageResourceId=imageResourceId;
        this.itemName = itemName;
        this.itemTime = itemTime;
        this.itemIntensity = itemIntensity;
        this.weekCurrent = weekCurrent;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemTime() {
        return itemTime;
    }

    public void setItemTime(int itemTime) {
        this.itemTime = itemTime;
    }

    public int getItemIntensity() {
        return itemIntensity;
    }

    public void setItemIntensity(int itemIntensity) {
        this.itemIntensity = itemIntensity;
    }

    public String getWeekCurrent() {
        return weekCurrent;
    }

    public void setWeekCurrent(String weekCurrent) {
        this.weekCurrent = weekCurrent;
    }
}
