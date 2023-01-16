package person;

public class Person {

    //类 类就是集合属性和行为 属性-》人的手  行为-》人用手去打篮球
    //对象 从类中丑一个人

    //类的属性
    private int a;
    private String username;

    //alt+insert command+n
    //全局变量：作用在一个所有范围的变量 局部变量：在一个区域内作用的变量（private）


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

    public Person(int a, String username) {
        this.a = a;
        this.username = username;
    }

    //类的行为
    public void playbasketball(){
        System.out.println("打篮球的");
    }
}
