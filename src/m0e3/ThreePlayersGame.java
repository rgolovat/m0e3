package m0e3;

/**
 * Created by Roman on 7/2/15.
 */
public class ThreePlayersGame extends TwoPlayersGame {


    private final String player3Name;

    public ThreePlayersGame (final String player1Name, final String player2Name, final String player3Name){
        super  (player1Name, player2Name);
        this.player3Name = player3Name;

    }

    public void printPlayer3Name() {
        System.out.println(this.player3Name);
    }

}

