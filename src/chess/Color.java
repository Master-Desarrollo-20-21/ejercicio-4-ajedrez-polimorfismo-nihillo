package src.chess;

public enum Color {
    WHITE(new int[] {0, 1}),
    BLACK(new int[] {7, 6});

    private final int[] initialRows;

    Color(int[] initialRows) {
        this.initialRows = initialRows;
    }

    public int[] getInitialRows() {
        return this.initialRows;
    }
}
