package person3interface;

public class personcometrue implements person{
    private int number;

    private String username;

    public  personcometrue(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public personcometrue(int number, String username) {
        this.number = number;
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void jump() {
        System.out.println("jump");
    }
}
