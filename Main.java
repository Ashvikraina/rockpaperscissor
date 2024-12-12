public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[4];  // Increase array size if adding more players
        boolean printsRun = false;

        players[0] = new Example1();
        players[1] = new PlayerExample();
        players[2] = new MJ();
        players[3] = new _6RainaAshvik(); // Add your player class here

        Game newGame = new Game(players, printsRun);
        newGame.play();
        newGame.displayScore();
    }
}
