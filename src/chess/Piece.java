package src.chess;

public abstract class Piece {

    protected Color color;
    protected String symbol;

    protected Piece(Color color) {
        this.color = color;
    }

    public static Piece getPiece(int colorIndex, int pieceIndex) {
        Color color = Color.values()[colorIndex];
        Piece piece;
        if (King.hasPieceIndex(pieceIndex)) {
        	piece = new King(color);
        } else if (Queen.hasPieceIndex(pieceIndex)) {
        	piece = new Queen(color);
        } else if (Bishop.hasPieceIndex(pieceIndex)) {
        	piece = new Bishop(color);
        } else if (Knight.hasPieceIndex(pieceIndex)) {	
        	piece = new Knight(color);
        } else if (Rook.hasPieceIndex(pieceIndex)) {	
        	piece = new Rook(color);
        } else {	
        	piece = new Pawn(color);
        }

        return piece;
    }

    public Coordinate getInitialPosition(int pieceIndex) {
        int rowIndex = Pawn.hasPieceIndex(pieceIndex) ? 1 : 0;
        return new Coordinate(this.color.getInitialRows()[rowIndex], this.getInitialColumn(pieceIndex));
    }

    protected abstract int getInitialColumn(int pieceIndex);

    public String getSymbol() {
        return this.symbol;
    }
}
