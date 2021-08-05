package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Programan {

	public static void main(String[] args) {
		Position pos = new Position(3, 5);
		
		Board bord = new Board(8, 8);
		
		ChessMatch chessMath = new ChessMatch();
		
		UI.printBoard(chessMath.getPieces());

	}

}
