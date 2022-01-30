import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitChangeTaskTest {

    @Test
    public void calculation() {
        assertEquals("1 second", UnitChangeTask.changeUnit(1));
        assertEquals("1 minute and 2 seconds",  UnitChangeTask.changeUnit(62));
        assertEquals("2 minutes",  UnitChangeTask.changeUnit(120));
        assertEquals("1 hour", UnitChangeTask.changeUnit(3600));
        assertEquals("1 hour, 1 minute and 2 seconds",  UnitChangeTask.changeUnit(3662));
    }
}
