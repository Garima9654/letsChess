package org.example.pieces;

import org.example.Board;
import org.example.Cell;
import org.example.Color;

public class Queen extends Piece {
    public Queen(Color color){
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell from, Cell to) {
        int rowDiff = Math.abs(to.getRow() - from.getRow());
        int colDiff = Math.abs(to.getCol() - from.getCol());
        return (rowDiff == colDiff) || (to.getCol() == from.getCol() || to.getRow() == from.getRow());
    }
}