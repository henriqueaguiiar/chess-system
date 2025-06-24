package br.com.henriqueaguiiar.chess.pieces;

import br.com.henriqueaguiiar.boardgame.Board;
import br.com.henriqueaguiiar.chess.ChessPiece;
import br.com.henriqueaguiiar.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
