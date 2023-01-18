package person3extend;

public class person {
    private int number;

    private String username;

    public person(){}

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

    public person(int number, String username) {
        this.number = number;
        this.username = username;
    }

    public void commonthing(){
        System.out.println("r人会h呼吸");
    }
}
