public class DartsGame {

    public static int score = 0;
    public static void turno(int pins) {
        score += pins;
    }

    public static int score() {
        return score;
    }

}

