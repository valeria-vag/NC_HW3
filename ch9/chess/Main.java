package com.netcracker.ch9.chess;

public class Main {
    public static void main(String[] args) {
        System.out.println("PAWN");
        Pawn pawn = new Pawn("a1");
        System.out.println("Possible moves from a1: " + pawn.canMoveTo());
        Pawn pawn1 = new Pawn("a2");
        System.out.println("Possible moves from a2: " + pawn1.canMoveTo());

        System.out.println("KING");
        King king = new King("a1");
        System.out.println("Possible moves from a1: " + king.canMoveTo());
        King king1 = new King("h5");
        System.out.println("Possible moves from h5: " + king1.canMoveTo());
        King king2 = new King("d5");
        System.out.println("Possible moves from d5: " + king2.canMoveTo());
    }


}
