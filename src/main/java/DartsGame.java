public class DartsGame {

    public static int score = 0;
    private static int[] turno = new int[21];
    public static void turno(int pins) {
        turno[score++] = pins;
    }

    public static int score() {
        int score = 0;
        int i = 0;
        for (int frame = 0; frame < 1; frame++) {
            score += turno[i] + turno[i + 1] + turno[i+1];
            i+=3;
        }
        return score;
    }

    public static void setScore(int valor) {
        score = valor;
    }
}

