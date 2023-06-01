
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DartsGameTest {
    private DartsGame  dartsGame;

    @BeforeEach
    void setUp() throws Exception{
        dartsGame = new DartsGame();
    }

    @Test
    void testTodoCero() throws Exception {
        DartsGame dartsGame = new DartsGame();
        DartsGame.setScore(0);
        for (int i = 0; i < 20; i++) {
            DartsGame.turno(0);
        }
        assertEquals(0, DartsGame.score());
    }

    @Test
    void testToduno() throws Exception {
        DartsGame dartsGame = new DartsGame();
        DartsGame.setScore(0);
        for (int i = 0; i < 20; i++) {
            DartsGame.turno(1);
        }
        assertEquals(3, DartsGame.score());
    }

    @Test
    void testTurnoPerfecto() throws Exception {
        DartsGame dartsGame = new DartsGame();
        DartsGame.setScore(0);
        for (int i = 0; i < 20; i++) {
            DartsGame.turno(20);
        }
        assertEquals(60, DartsGame.score());
    }

    private void rollMany(int n, int pins){
        for (int i = 0; i < n; i++) {
            dartsGame.turno(pins);

        }
    }

}