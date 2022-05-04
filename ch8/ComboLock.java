package com.netcracker.ch8;

public class ComboLock {
    private int secret1;
    private int secret2;
    private int secret3;
    private int currentSecret;
    private int count;

    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }

    public void reset() {
        this.count = 0;
        this.currentSecret = 0;
        this.secret1 = 0;
        this.secret2 = 0;
        this.secret3 = 0;
    }

    public void setSecret (int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }

    public void turnRight(int ticks) {
        currentSecret = (currentSecret + ticks) % 40;

        if (count == 0 && currentSecret == secret1)
            count++;
        else
            if (count == 2 && currentSecret == secret3)
                count++;
            else count = 0;
    }

    public void turnLeft(int ticks) {
        currentSecret = (currentSecret - ticks) % 40;
        if (currentSecret < 0) currentSecret += 40;
        if (count == 1 && currentSecret == secret2)
            count++;
        else
            count = 0;
    }

    public boolean open() {
        return true ? (count == 3) : false;
    }

    @Override
    public String toString() {
        return "ComboLock {" +
                "secret1 = " + secret1 +
                ", secret2 = " + secret2 +
                ", secret3 = " + secret3 +
                '}';
    }

    public int getCurrentSecret() {
        return currentSecret;
    }
}
