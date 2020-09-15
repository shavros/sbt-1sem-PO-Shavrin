package testsForFigures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import myFigures.circle;

class circleTest {
    private final circle cir = new circle(4);
    private final circle cir0 = new circle(0);

    @Test
    void addition(){
        assertEquals(4 * 4 * 3.14, cir.calculateArea());
        assertEquals(0, cir0.calculateArea());
    }
}
