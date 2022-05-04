package com.netcracker.ch9.chess;

import java.util.ArrayList;

public class ChessPiece {
    private String position;
    ArrayList<String> moveTo = new ArrayList<>();

    public void setPosition(String position) {
        this.position = position;
    }

    public void setMoveTo(String moveTo) {
        this.moveTo.add(moveTo);
    }

    public ArrayList<String> canMoveTo() {
        return moveTo;
    }
}