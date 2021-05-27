import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<Time> timeList(int hours, int minutes, int seconds) {
        List<Time> list = new ArrayList<>();
        Time t = new Time(hours, minutes, seconds);
        list.add(t);
        return list;
    }


    @Test
    public void multipleConditionMethod() {
        RuntimeException exception;
        assertEquals(3993, SILab2.function(timeList(23, 59, 18)));

        assertEquals(86400, SILab2.function(timeList(24, 0, 0)));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(25, 05, 19)));
        assertTrue(exception.getMessage().contains("The hours are greater than the maximum"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(-5, 12, 12)));
        assertTrue(exception.getMessage().contains("The hours are smaller than the minimum"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(20, 20, 60)));
        assertTrue(exception.getMessage().contains("The seconds are not valid"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(24, 05, 05)));
        assertTrue(exception.getMessage().contains("The time is greater than the maximum"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(23, 60, 18)));
        assertTrue(exception.getMessage().contains("The minutes are not valid"));
    }


    @Test
    public void everyBranchMethod() {
        RuntimeException exception;
        assertEquals(3993, SILab2.function(timeList(23, 59, 18)));

        assertEquals(86400, SILab2.function(timeList(24, 0, 0)));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(25, 05, 19)));
        assertTrue(exception.getMessage().contains("The hours are greater than the maximum"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(-5, 12, 12)));
        assertTrue(exception.getMessage().contains("The hours are smaller than the minimum"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(20, 20, 60)));
        assertTrue(exception.getMessage().contains("The seconds are not valid"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(24, 05, 05)));
        assertTrue(exception.getMessage().contains("The time is greater than the maximum"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(timeList(23, 60, 18)));
        assertTrue(exception.getMessage().contains("The minutes are not valid"));
    }
}