package N1Ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListTest2 {

    @Test
    public void TestGetPlayer(){

        Assertions.assertThrows(IndexOutOfBoundsException.class,()->List2.getPlayer(5));

    }
}
