package src.chess;

public class Coordinate {
	
	private int row;
	private int column;

	public Coordinate(int i, int j) {
		this.row = i;
		this.column = j;
	}

	public int getRow() {
		return this.row;
	}

	public int getColumn() {
		return this.column;
	}

}
