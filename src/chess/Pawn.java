package src.chess;

import java.util.Arrays;

public class Pawn extends Piece {

    private static final int[] PIECE_INDEXES = new int[] { 8, 9, 10, 11, 12, 13, 14, 15 };
    private final int[] INITIAL_COLUMNS = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
    private final String[] SYMBOL_COLOR = new String[] {"\u2659", "\u265F"};

    public Pawn(Color color) {
        super(color);
        this.symbol = this.SYMBOL_COLOR[this.color.ordinal()];
    }

    protected static boolean hasPieceIndex(int pieceIndex) {
        return Arrays.binarySearch(PIECE_INDEXES, pieceIndex) >= 0;
    }

    @Override
    protected int getInitialColumn(int pieceIndex) {
        int i = Arrays.binarySearch(PIECE_INDEXES, pieceIndex);
        return this.INITIAL_COLUMNS[i];
    }
}
