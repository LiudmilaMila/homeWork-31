
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTaskTest {
    @Test
    public void stringLineIsDividedIntoThree() {
        assertFalse(MyTask.resultTask("True"));
        assertFalse(MyTask.resultTask("466815418jknjknjk55"));
        assertFalse(MyTask.resultTask("Hi"));
    }

    @Test
    public void numericLineIsNotDividedIntoThree() {
        assertFalse(MyTask.resultTask("42346531253451624153651416655516651356153615136563"));
        assertFalse(MyTask.resultTask("42346531252234615136563"));
    }

    @Test
    public void numericLineIsDividedIntoThree() {
        assertTrue(MyTask.resultTask("423465312534615136563"));
        assertTrue(MyTask.resultTask("153165156183484643"));
    }

    @Test
    public void nullIsDividedIntoThree() {
        assertFalse(MyTask.resultTask(null));
    }

    @Test
    public void emptyLineIsDividedIntoThree() {
        assertFalse(MyTask.resultTask(""));
    }
}
