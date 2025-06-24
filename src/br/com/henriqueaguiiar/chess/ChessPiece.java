package br.com.henriqueaguiiar.chess;

import br.com.henriqueaguiiar.boardgame.Board;
import br.com.henriqueaguiiar.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
