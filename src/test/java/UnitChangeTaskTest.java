import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitChangeTaskTest {

    @Test
    public void calculation() {
        assertEquals(0 + " years " +
                0 + " days " + 0 + " hours " + 1 + " minutes " +
                2 + " seconds ", UnitChangeTask.changeUnit(62));
        assertEquals(0 + " years " +
                0 + " days " + 0 + " hours " + 2 + " minutes " +
                0 + " seconds ", UnitChangeTask.changeUnit(120));
        assertEquals(0 + " years " +
                0 + " days " + 1 + " hours " + 0 + " minutes " +
                0 + " seconds ", UnitChangeTask.changeUnit(3600));
        assertEquals(0 + " years " +
                0 + " days " + 1 + " hours " + 1 + " minutes " +
                3 + " seconds ", UnitChangeTask.changeUnit(3662));
    }
}
