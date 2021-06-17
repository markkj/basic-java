import java.util.ArrayList;
import java.util.List;

public class MySort {
    List<Integer> input;

    public MySort(List<Integer> input){
        this.input = input;
    }

    public List<Integer> sortedList() {
        if(this.input.size() <= 1)
            return this.input;

        return new ArrayList<>();
    }
}
