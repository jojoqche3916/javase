package person;

public class animal {
    //1给一个类的属性 private - getter&setter 2定义构造方法-初始化 constructor 3定义类的行为
    private String monkey;
    private String mouth;

    public String getMonkey() {
        return monkey;
    }

    public void setMonkey(String monkey) {
        this.monkey = monkey;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public animal(String monkey, String mouth) {
        this.monkey = monkey;
        this.mouth = mouth;
    }
    public String banana(){
        return "猴子香蕉";
    }
}
