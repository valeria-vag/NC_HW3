package com.netcracker.ch3;

public class Sheet {
    private int height;
    private int width;
    private int name;

    public Sheet() {
        this.height = 1189;
        this.width = 841;
    }

    public Sheet cutInHalf() {
        int heightNew = this.width;
        width = this.height / 2;
        height = heightNew;
        name++;
        return this;
    }

    @Override
    public String toString() {
        return "Sheet {" +
                "height = " + height +
                ", width = " + width +
                ", A" + name +
                '}';
    }
}
