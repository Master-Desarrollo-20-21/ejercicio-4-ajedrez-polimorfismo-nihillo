package src.chess;

import java.util.ArrayList;
import java.util.Arrays;

public class Board {

	private Square[][] squares = new Square[8][8];
	private Piece[][] pieces = new Piece[2][16];

	public Board() {
		this.generateSquares();
		this.initPieces();
	}

	private void generateSquares() {
		for (int i=0; i < this.squares.length; i++) {
			for (int j=0; j < this.squares[i].length; j++) {
				this.squares[i][j] = new Square(i, j);
			}
		}
	}

	private void initPieces() {
		for (int colorIndex = 0; colorIndex < this.pieces.length; colorIndex++) {
			for (int pieceIndex=0; pieceIndex < this.pieces[colorIndex].length; pieceIndex++) {
				Piece piece = Piece.getPiece(colorIndex, pieceIndex);
				this.pieces[colorIndex][pieceIndex] = piece;
				Coordinate position = piece.getInitialPosition(pieceIndex);
				this.getSquareByCoordinate(position).setPiece(piece);
			}
		}
	}

	private Square getSquareByCoordinate(Coordinate coordinate) {
		return this.squares[coordinate.getRow()][coordinate.getColumn()];
	}

	public void show() {
		Console console = new Console();
		console.out("  ---------------------------------\n");
		for (int i=squares.length-1; i >= 0 ; i--) {
			console.out((i+1) + " ");
			for (int j=0; j < this.squares[i].length; j++) {	
				console.out("|");
				Square square = this.squares[i][j];
				console.out(square.getContent());
				
			}
			console.out("|\n");
			console.out("  ---------------------------------\n");
		}
		console.out("    A   B   C   D   E   F   G   H  \n");
	}

	public Square getSquareByStringCoordinate(String stringCoordinate) {
		ArrayList<Character> letterValues = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')); 
		
		int i = Character.getNumericValue(stringCoordinate.charAt(1) - 1);
		int j = letterValues.indexOf(stringCoordinate.charAt(0));

		return getSquareByCoordinate(new Coordinate(i, j));
	}
}
