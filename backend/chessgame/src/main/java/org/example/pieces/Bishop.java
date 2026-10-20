package org.example.pieces;

import org.example.Board;
import org.example.Cell;
import org.example.Color;

public class Bishop extends Piece {
    public Bishop(Color color){
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell from, Cell to) {
        int colDiff = Math.abs(from.getCol() - to.getCol());
        int rowDiff = Math.abs(from.getRow() - to.getRow());
        return colDiff == rowDiff;
    }
}