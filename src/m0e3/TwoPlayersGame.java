package m0e3;

/**
 * Created by Roman on 7/2/15.
 */
public class TwoPlayersGame extends Game {

    private final String player1Name;

    private final String player2Name;

    public TwoPlayersGame (final String player1Name, final String player2Name){
        this.player1Name = player1Name;
        this.player2Name = player2Name;

    }

    public void printPlayer1Name() {
        System.out.println(this.player1Name);
    }

    public void printPlayer2Name() {
        System.out.println(this.player2Name);
    }
}
