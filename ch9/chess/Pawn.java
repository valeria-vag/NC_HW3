package com.netcracker.ch9.chess;

/*Со стартовой позиции - 1 или 2 клетки вперед.
Дальше - только одна клетка вперед*/

public class Pawn extends ChessPiece {
    public Pawn(String position) {
        super.setPosition(position);
        char number = position.charAt(1);
        if (number == '1'){
            super.setMoveTo(position.replace(number, (char) (number + 1)));
            super.setMoveTo(position.replace(number, (char) (number + 2)));
        }
        else if (number < '8')
            super.setMoveTo(position.replace(number, (char) (number + 1)));
    }
}
