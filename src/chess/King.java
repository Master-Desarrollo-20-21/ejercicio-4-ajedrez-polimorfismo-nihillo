package src.chess;

import java.util.Arrays;

public class King extends Piece {

    private static final int[] PIECE_INDEXES = new int[] {0};
    private final int[] INITIAL_COLUMNS = new int[] {4};
    private final String[] SYMBOL_COLOR = new String[] {"\u2654", "\u265A"};
    
    public King(Color color) {
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
