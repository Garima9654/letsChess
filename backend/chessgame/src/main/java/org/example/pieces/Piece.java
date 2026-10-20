package org.example.pieces;

import org.example.Board;
import org.example.Cell;
import org.example.Color;

public abstract class Piece{
    protected final Color color;
    Piece(Color color1){
        this.color = color1;
    }

    public abstract boolean canMove(Board board, Cell from, Cell to);

    public Color getColor() {
        return color;
    }
}