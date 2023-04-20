package N1Ex1;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthTest {

    List <String> monthList = Month.insertMonth();

    @Test
    public void TestSizeList () {
        assertEquals(12,monthList.size());
    }

    @Test
    public void TestGetMonth () {
        assertEquals("August", monthList.get(7));
    }

    @Test
    public void TestIsEmpty () {
        assertEquals(false, monthList.isEmpty());
    }


}