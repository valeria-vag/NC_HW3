package com.netcracker.ch9.chess;

/* На одну клетку в любом направлении*/

public class King extends ChessPiece {
    public King(String position) {
        super.setPosition(position);
        char letter = position.charAt(0);
        char number = position.charAt(1);

        //центр
        if (letter > 'a' && letter < 'h' && number > '1' && number < '8') {
            super.setMoveTo(position.replace(number, (char) (number + 1)));
            super.setMoveTo(position.replace(number, (char) (number - 1)));
            super.setMoveTo(position.replace(letter, (char) (letter + 1)));
            super.setMoveTo(position.replace(letter, (char) (letter - 1)));
            super.setMoveTo(position.replace(number, (char) (number + 1))
                    .replace(letter, (char) (letter + 1)));
            super.setMoveTo(position.replace(number, (char) (number - 1))
                    .replace(letter, (char) (letter - 1)));
            super.setMoveTo(position.replace(number, (char) (number + 1))
                    .replace(letter, (char) (letter - 1)));
            super.setMoveTo(position.replace(number, (char) (number - 1))
                    .replace(letter, (char) (letter + 1)));
            //левый крайний столбец
        } else if (letter == 'a') {
            if (number == '1') {
                super.setMoveTo(position.replace(number, (char) (number + 1)));
                super.setMoveTo(position.replace(letter, (char) (letter + 1)));
                super.setMoveTo(position.replace(number, (char) (number + 1))
                        .replace(letter, (char) (letter + 1)));
            } else if (number == '8') {
                super.setMoveTo(position.replace(number, (char) (number - 1)));
                super.setMoveTo(position.replace(letter, (char) (letter + 1)));
                super.setMoveTo(position.replace(number, (char) (number - 1))
                        .replace(letter, (char) (letter + 1)));
            } else {
                super.setMoveTo(position.replace(number, (char) (number + 1)));
                super.setMoveTo(position.replace(number, (char) (number - 1)));
                super.setMoveTo(position.replace(letter, (char) (letter + 1)));
                super.setMoveTo(position.replace(number, (char) (number + 1))
                        .replace(letter, (char) (letter + 1)));
                super.setMoveTo(position.replace(number, (char) (number - 1))
                        .replace(letter, (char) (letter + 1)));
            }
            //правый крайний столбец
        } else if (letter == 'h') {
            if (number == '1') {
                super.setMoveTo(position.replace(number, (char) (number + 1)));
                super.setMoveTo(position.replace(letter, (char) (letter - 1)));
                super.setMoveTo(position.replace(number, (char) (number + 1))
                        .replace(letter, (char) (letter - 1)));
            } else if (number == '8') {
                super.setMoveTo(position.replace(number, (char) (number - 1)));
                super.setMoveTo(position.replace(letter, (char) (letter - 1)));
                super.setMoveTo(position.replace(number, (char) (number - 1))
                        .replace(letter, (char) (letter - 1)));
            } else {
                super.setMoveTo(position.replace(number, (char) (number + 1)));
                super.setMoveTo(position.replace(number, (char) (number - 1)));
                super.setMoveTo(position.replace(letter, (char) (letter - 1)));
                super.setMoveTo(position.replace(number, (char) (number + 1))
                        .replace(letter, (char) (letter - 1)));
                super.setMoveTo(position.replace(number, (char) (number - 1))
                        .replace(letter, (char) (letter - 1)));
            }
        } else {
            if (number == '1') {
                super.setMoveTo(position.replace(number, (char) (number + 1)));
                super.setMoveTo(position.replace(number, (char) (letter - 1)));
                super.setMoveTo(position.replace(letter, (char) (letter + 1)));
                super.setMoveTo(position.replace(number, (char) (number + 1))
                        .replace(letter, (char) (letter + 1)));
                super.setMoveTo(position.replace(number, (char) (number + 1))
                        .replace(letter, (char) (letter - 1)));
            } else {
                super.setMoveTo(position.replace(number, (char) (number - 1)));
                super.setMoveTo(position.replace(number, (char) (letter - 1)));
                super.setMoveTo(position.replace(letter, (char) (letter + 1)));
                super.setMoveTo(position.replace(number, (char) (number - 1))
                        .replace(letter, (char) (letter + 1)));
                super.setMoveTo(position.replace(number, (char) (number - 1))
                        .replace(letter, (char) (letter - 1)));
            }
        }

    }
}