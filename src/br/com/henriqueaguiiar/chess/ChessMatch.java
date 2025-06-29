package br.com.henriqueaguiiar.chess;

import br.com.henriqueaguiiar.boardgame.Board;
import br.com.henriqueaguiiar.boardgame.Position;
import br.com.henriqueaguiiar.chess.pieces.King;
import br.com.henriqueaguiiar.chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matriz[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return  matriz;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board,Color.BLACK), new Position(0,4));
    }

}
