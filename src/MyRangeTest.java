import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {

    @Test
    @DisplayName("Check input start with '[' ")
    public void checkIsStartWithInclude(){
        MyRange2 ms = new MyRange2("[1,2]");
        boolean result = ms.startWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("Check input start with '(' ")
    public void checkIsStartWithExclude(){
        MyRange2 ms = new MyRange2("(1,2]");
        boolean result = ms.startWithExclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("Check input end with ']' ")
    public void checkIsEndWithInclude(){
        MyRange2 ms = new MyRange2("(1,2]");
        boolean result = ms.endWithExclude();
        assertTrue(result);
    }



}