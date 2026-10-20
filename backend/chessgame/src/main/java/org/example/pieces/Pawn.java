package org.example.pieces;

import org.example.Board;
import org.example.Cell;
import org.example.Color;

public class Pawn extends Piece {
    public Pawn(Color color){
        super(color);
    }

    @Override
    public boolean canMove(Board board, Cell from, Cell to) {
        int rowDiff = to.getRow() - from.getRow();
        int colDiff = Math.abs(to.getCol() - from.getCol());
        if(color == Color.WHITE){
            return (rowDiff==1 && colDiff==0) || (from.getRow()==1 && rowDiff==2 && colDiff==0)
                    || (rowDiff==1 && colDiff==1 && board.getPiece(to.getRow(), to.getCol()) != null);
        }
        else{
            return (rowDiff==-1 && colDiff==0) || (from.getRow()==6 && rowDiff==-2 && colDiff==0)
                    || (rowDiff==-1 && colDiff==1 && board.getPiece(to.getRow(), to.getCol()) != null);
        }

        //cant we move to both right and left direction if someone with different color
        // is present there still some gaps are there in this logic
    }
}