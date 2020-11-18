package src.chess;

public class Square {

	private final String WHITE_BACKGROUND = " ";
	private final String BLACK_BACKGROUND = ":";
	private Coordinate coordinate;
	private Piece piece;

	public Square(int i, int j) {
        this.coordinate = new Coordinate(i, j);
        this.piece = null;
	}

	public String getContent() {
		String background = this.getBackground();
		String symbol = this.piece != null ? this.piece.getSymbol() : background;
		return background + symbol + background;
	}

	private String getBackground() {
		return (this.coordinate.getRow() + this.coordinate.getColumn()) % 2 == 0 ? BLACK_BACKGROUND : WHITE_BACKGROUND;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

}
