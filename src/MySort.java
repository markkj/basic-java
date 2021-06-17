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
        for (int i = 0; i < this.input.size()-1; i++) {
            if(this.input.get(i) > this.input.get(i+1)){
                int temp = this.input.get(i);
                this.input.set(i,this.input.get(i+1));
                this.input.set(i+1,temp);

            }
        }
        return this.input;
    }
}
