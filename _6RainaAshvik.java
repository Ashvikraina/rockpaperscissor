import java.util.*;

public class _6RainaAshvik implements Player {
    private static String name = "RainaAshvik";
    private Random random = new Random();

    public String move(String[] myMoves, String[] opponentMoves, int myScore, int opponentScore) {
        int moveIndex = getMostRecentMoveIndex(myMoves);

        // Every 4 moves, make a random move
        if ((moveIndex + 1) % 4 == 0) {
            return randomMove();
        }

        if (opponentMoves.length == 0 || opponentMoves[0] == null) {
            return "r";
        }

        String lastMove = opponentMoves[moveIndex];
        return counterMove(lastMove);
    }

    private int getMostRecentMoveIndex(String[] moves) {
        int index = 0;
        while (index < moves.length && moves[index] != null) {
            index++;
        }
        return index - 1;
    }

    private String counterMove(String move) {
        switch (move) {
            case "r":
                return "p";
            case "p":
                return "s";
            case "s":
                return "r";
            default:
                return "r";
        }
    }

    private String randomMove() {
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                return "r";
            case 1:
                return "p";
            case 2:
                return "s";
            default:
                return "r";
        }
    }

    public String getName() {
        return name;
    }
}
