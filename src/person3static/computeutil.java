package person3static;

public class computeutil {
    public static int plus(int a,int b){
        return a+b;
    }
    public static int minus(int a,int b){
        return a-b;

    }
    public static float chengfa(float c,float d){
        return c*d;

    }
    public static double chufa(double c,double d){
        try {
            return c/d;
        } catch (Exception e) {
            System.out.println("xxxxxxx");
            throw new RuntimeException(e);
        }
    }


}
