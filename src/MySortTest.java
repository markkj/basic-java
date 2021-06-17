import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    @DisplayName("Test on empty list should return [] ")
    public void testSortingWithEmptyList(){
        List<Integer> input = Arrays.asList();
        MySort ms = new MySort(input);
        List<Integer> result = ms.sortedList();
        assertEquals(new ArrayList<>(),result);

    }
}