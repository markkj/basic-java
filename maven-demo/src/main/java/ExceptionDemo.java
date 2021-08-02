
public class ExceptionDemo {
    public int method1(String s){

        return method2(s);
    }

    public int method2(String s){
        s += "2";
        return method3(s);
    }

    private int method3(String s) {
        try{
            int id = Integer.parseInt(s);
            return id;
        }catch (NumberFormatException e){
            throw new RuntimeException(e);
        }
    }
}
