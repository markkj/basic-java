import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    public void testSortingWithEmptyList(){
        List<Integer> input = new ArrayList<>();
        MySort ms = new MySort(input);

    }
}