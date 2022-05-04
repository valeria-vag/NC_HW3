package com.netcracker.ch9.clock;

import java.time.LocalTime;

public class Clock {
    private int hours;
    private int minutes;
    private int alarmHours;
    private int alarmMinutes;
    private boolean alarm = false;

    public int getHours() {
        String time = LocalTime.now().toString().substring(0, 2);
        return Integer.parseInt(time);
    }

    public int getMinutes() {
        String time = LocalTime.now().toString().substring(3, 5);
        return Integer.parseInt(time);
    }

    public String getTime() {
        if (alarm == true && getHours() >= alarmHours &&
                getMinutes() >= this.alarmMinutes)
        {
            return getHours() + ":" + getMinutes() + "\u23F0";
        }
        else
            return getHours() + ":" + getMinutes();
    }

    public void setAlarm(int hours, int minutes) {
        this.alarm = true;
        this.alarmHours = hours;
        this.alarmMinutes = minutes;
    }
}
