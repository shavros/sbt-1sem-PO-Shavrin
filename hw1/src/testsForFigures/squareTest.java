package testsForFigures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import myFigures.square;


class squareTest {
    private final square squ = new square(3);
    private final square squ0 = new square(0);

    @Test
    void addition() {
        assertEquals(9, squ.calculateArea());
        assertEquals(0, squ0.calculateArea());
    }
}
