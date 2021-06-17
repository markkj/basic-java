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
        sort(this.input,0,this.input.size()-1);
        return this.input;
    }

    public void sort(List<Integer> arr , int left, int right){
        /*
        * 3,2,1,5,6
        * 3,2,1   ||    5,6
        * 3 2,1  ||  5,6
        * 3 1,2
        * 1,2,3
        * 1,2,3,5 => merge array list
        * left =
        * */
        if(left < right){
            int middle = (left+right-1)/2;
            sort(arr,left,middle);
            sort(arr,middle+1,right);
            merge(arr,left,middle,right);
        }

    }

    public void merge(List<Integer> arr, int left, int middle, int right) {
        List<Integer> L = new ArrayList<>();
        List<Integer> R = new ArrayList<>();

        for (int i = 0; i < middle-left+1; i++) {
            L.add(arr.get(left+i));
        }

        for (int i = 0; i < right-middle; i++) {
            R.add(arr.get(middle+1+i));
        }

        int i = 0;
        int j = 0;
        int k = left;
        while(i<L.size() && j<R.size()){
            if(L.get(i) > R.get(j)){
                arr.set(k,R.get(j));
                j++;
            }else{
                arr.set(k,L.get(i));
                i++;
            }
            k++;
        }

        while (i<L.size()){
            arr.set(k,L.get(i));
            i++;
            k++;
        }
        while (j<R.size()){
            arr.set(k,R.get(j));
            j++;
            k++;
        }

    }




}
