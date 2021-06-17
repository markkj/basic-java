public class MyRange2 {

    private final String input;

    public MyRange2(String input){
        this.input = input;
    }

    public boolean startWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean startWithExclude() {
        return this.input.startsWith("(");
    }

    public boolean endWithExclude() {
        return this.input.endsWith("]");
    }
}
