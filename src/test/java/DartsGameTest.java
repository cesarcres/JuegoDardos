
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DartsGameTest {

    @Test
    void testTodoCero() throws Exception {
        DartsGame dartsGame = new DartsGame();
        for (int i = 0; i < 20; i++) {
            DartsGame.turno(0);
        }
        assertEquals(0, DartsGame.score());
    }
}