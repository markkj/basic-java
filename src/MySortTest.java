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

    @Test
    @DisplayName("Test have only one element in list")
    public void testSortingWithOneElement(){
        List<Integer> input = Arrays.asList(1);
        MySort ms = new MySort(input);
        List<Integer> result = ms.sortedList();
        assertEquals(Arrays.asList(1),result);
    }

    @Test
    @DisplayName("Test Sorting with sorted list have 2 element")
    public void testSortingWithTwoElementWithSorted(){
        List<Integer> input = Arrays.asList(1,2);
        MySort ms = new MySort(input);
        List<Integer> result = ms.sortedList();
        assertEquals(Arrays.asList(1,2),result);
    }

    @Test
    @DisplayName("Test Sorting with without sorted list have 2 element")
    public void testSortingWithTwoElementWithoutSorted(){
        List<Integer> input = Arrays.asList(2,1);
        MySort ms = new MySort(input);
        List<Integer> result = ms.sortedList();
        assertEquals(Arrays.asList(1,2),result);
    }

    @Test
    @DisplayName("Test Sorting with sorted list have 3 element")
    public void testSortingWithThreeElementWithSorted(){
        List<Integer> input = Arrays.asList(1,2,3);
        MySort ms = new MySort(input);
        List<Integer> result = ms.sortedList();
        assertEquals(Arrays.asList(1,2,3),result);
    }

    @Test
    @DisplayName("Test Sorting with without sorted list have 3 element")
    public void testSortingWithThreeElementWithoutSorted(){
        List<Integer> input = Arrays.asList(2,1,3);
        MySort ms = new MySort(input);
        List<Integer> result = ms.sortedList();
        assertEquals(Arrays.asList(1,2,3),result);
    }

    @Test
    @DisplayName("Test Sorting with without sorted list have 3 element should")
    public void testSortingWithThreeElementWithoutSorted2(){
        List<Integer> input = Arrays.asList(1,3,2);
        MySort ms = new MySort(input);
        List<Integer> result = ms.sortedList();
        assertEquals(Arrays.asList(1,2,3),result);
    }

    @Test
    @DisplayName("Test Sorting with without sorted list have 3 element should")
    public void testSortingWithThreeElementWithoutSorted3(){
        List<Integer> input = Arrays.asList(3,2,1);
        MySort ms = new MySort(input);
        List<Integer> result = ms.sortedList();
        assertEquals(Arrays.asList(1,2,3),result);
    }

    @Test
    @DisplayName("Test Sorting with without sorted list have 5 element should")
    public void testSortingWithFiveElementWithoutSorted(){
        List<Integer> input = Arrays.asList(5,4,3,2,1);
        MySort ms = new MySort(input);
        List<Integer> result = ms.sortedList();
        assertEquals(Arrays.asList(1,2,3,4,5),result);
    }
}