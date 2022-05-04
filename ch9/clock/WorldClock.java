package com.netcracker.ch9.clock;

public class WorldClock extends Clock{
    private int timezone;

    public WorldClock(int timezone){
        this.timezone = timezone;
    }

    @Override
    public int getHours() {
        return (super.getHours() + timezone) % 24;
    }

    @Override
    public int getMinutes() {
        return super.getMinutes();
    }

    @Override
    public String toString() {
        return "Timezone (" + timezone + "): " +
        getHours() + ":" + getMinutes();
    }
}
