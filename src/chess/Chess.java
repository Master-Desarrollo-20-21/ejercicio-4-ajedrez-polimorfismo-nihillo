package src.chess;

public class Chess {

    private Player[] players = new Player[2];
	private Board board;
    private int turn;
    
    Chess() {
        this.turn = 0;
        this.board = new Board();
        for (int i = 0; i < players.length; i++) {
            this.players[i] = new Player(i);
        } 
    }
    
    public void play() {
        Player currentPlayer;
        do {
            this.board.show();
            currentPlayer = this.players[this.turn];
            currentPlayer.move(this.board);
            this.switchTurn();
            
        } while (!currentPlayer.isWinner());
        
    }

    private void switchTurn() {
        this.turn = Math.abs(this.turn - 1);
    }

    public static void main(String[] args) {
       Chess chess = new Chess();
       chess.play();
    }
}
