import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {

    @Test
    @DisplayName("Check input start with '[' ")
    public void checkIsStartWithInclude(){
        MyRange ms = new MyRange("[1,2]");
        boolean result = ms.startWithInclude();
        assertTrue(result);
    }



}