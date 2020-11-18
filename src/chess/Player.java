package src.chess;

public class Player {

	private Color color;

	public Player(int i) {
		this.color = Color.values()[i];
	}
 
	public boolean isWinner() {
		return true;
	}

	public void move(Board board) {
		String[] stringCoordinate = this.enterMovement();
		Square source = board.getSquareByStringCoordinate(stringCoordinate[0]);
		Square destinaton = board.getSquareByStringCoordinate(stringCoordinate[1]);

		// TODO
	}

	private String[] enterMovement() {
		Console console = new Console();

		console.out(this.color.toString() + " enter movement\n");
		console.out("Source and destination separated by ':' (e.g. B2:B4)\n");
		return console.readString(null).split(":");
	}
}
