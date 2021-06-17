import java.util.ArrayList;
import java.util.List;

public class MyRange {
    /*
    * Input between [-9,9]
    * */
    String input;

    public MyRange(String input){
        this.input = input;
    }
    public boolean startWithInclude(){
        return this.input.startsWith("[");
    }

    public boolean startWithExclude(){
        return this.input.startsWith("(");
    }

    public boolean endWithInclude(){
        return this.input.endsWith("]");
    }

    public boolean endWithExclude(){
        return this.input.endsWith("(");
    }

    public int getFirstNumber(){
        return Character.getNumericValue(this.input.charAt(1));
    }

    public int getSecondNumber(){
        return Character.getNumericValue(this.input.charAt(3));
    }

    public String showResult(){
        int startNumber = this.startWithInclude() ? this.getFirstNumber():this.getFirstNumber()+1;
        int endNumber = this.endWithInclude() ? this.getSecondNumber()+1:this.getSecondNumber();

        List<String> result = new ArrayList<>();
        for (int i = startNumber; i < endNumber; i++) {
            result.add(Integer.toString(i));
        }
        return String.join(",",result);
    }

}
