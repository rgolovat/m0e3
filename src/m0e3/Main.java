package m0e3;

public class Main {
    public static void main(String[] args){

        final Board board = new Board();

        final Game game = new Game();
        game.printGameName();
        final TwoPlayersGame twoPlayersGame = new TwoPlayersGame("Petro", "Vasya");
        twoPlayersGame.printPlayer1Name();
        twoPlayersGame.printPlayer2Name();
        twoPlayersGame.printGameName();

        final ThreePlayersGame threePlayersGame = new ThreePlayersGame("Nika", "Obdolb", "Gala");
        threePlayersGame.printPlayer1Name();
        threePlayersGame.printPlayer2Name();
        threePlayersGame.printPlayer3Name();
        threePlayersGame.printGameName();

        printGameNameAndBoard(threePlayersGame, board);

    }

    private static void printGameNameAndBoard (final Game game, final Board board){
        game.printGameName();
        System.out.println("============");
        board.printBoard();





    }
}
