package person2;

public class People {

    private int a;
    private String username;

    //无参构造：每次new对象不需要传入参数
    public People(){
        
    }

    //有参构造：每次new对象都需要传入参数
    public People(int a, String username) {
        this.a = a;
        this.username = username;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String playbasketball(){
        return "play basketball";
    }
}

