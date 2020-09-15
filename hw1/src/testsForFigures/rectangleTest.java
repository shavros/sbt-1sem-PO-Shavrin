package testsForFigures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import myFigures.rectangle;

class rectangleTest {
    private final rectangle rec = new rectangle(3,7);
    private final rectangle rec0 = new rectangle(0, 0);

    @Test
    void addition(){
        assertEquals(21, rec.calculateArea());
        assertEquals(0, rec0.calculateArea());
    }
}
