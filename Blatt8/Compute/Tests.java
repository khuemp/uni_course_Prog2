package Blatt8.Compute;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jdk.jfr.Timestamp;

public class Tests {
    Compute comp = new Compute();

    @Test
    public void n_zero_test() {
        int result = comp.rec(0, 1, 2);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void y_zero_test() {
        int result = comp.rec(100, 5, 0);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void y_not_zero_test() {
        int result = comp.rec(1, 2, 3);
        int expected = 27;
        assertEquals(expected, result);
    }

    @Test
    public void one_step_test() {
        int result = comp.rec(1, 2, 0);
        int expected = 2;
        assertEquals(expected, result);
    }
}
