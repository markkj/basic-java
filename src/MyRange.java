import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyRange {
    /*
    * Input between [0,9]
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
        return this.input.endsWith(")");
    }

    public int getFirstNumber(){
        return Character.getNumericValue(this.input.charAt(1));
    }

    public int getSecondNumber(){
        return Character.getNumericValue(this.input.charAt(3));
    }


    public boolean checkStartWithIncludeOrExclude(){
        return this.startWithInclude() || this.startWithExclude();

    }

    public boolean checkEndWithIncludeOrExclude(){
        return this.endWithExclude() || this.endWithInclude();
    }

    public boolean checkIntervalNumber(){
        return this.input.length() == 5;

    }
    public String showResult(){
        if(!(this.checkEndWithIncludeOrExclude() && this.checkStartWithIncludeOrExclude() && this.checkIntervalNumber())){
            return "Invalid Format";
        }
        int startNumber = this.startWithInclude() ? this.getFirstNumber():this.getFirstNumber()+1;
        int endNumber = this.endWithInclude() ? this.getSecondNumber()+1:this.getSecondNumber();
        if(startNumber >= endNumber){
            return "Invalid Format";
        }
        List<String> result = new ArrayList<>();
        for (int i = startNumber; i < endNumber; i++) {
            result.add(Integer.toString(i));
        }
        return String.join(",",result);
    }

}
