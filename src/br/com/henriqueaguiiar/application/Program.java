package br.com.henriqueaguiiar.application;

import br.com.henriqueaguiiar.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {


        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());



    }
}
