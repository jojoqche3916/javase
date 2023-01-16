import person.Person;
import person.animal;

public class Main {
    //1.主函数psvm：任何函数的入口
    public static void main(String[] args) {
        //2.sout：输出到控制台
        System.out.println(1234);
        //3.数据类型
        //整型
        int a=0;
        //用户名称
        String username="我叫"+"afei";
        System.out.println(a);
        System.out.println(username);
        //4.变量与常量
        //整型int 短整型short 长整型long 代表范围不一样
        //浮点数 单浮点数float 双浮点数double 代表精度不一样
        //变量
        float b=1.0F;
        //代表表示的范围
        long d=1l;
        //常量使用final定义不能修改
        final int PASS_WAY=1;
        System.out.println(b+PASS_WAY);

        //5。定义并修改对象名称 只要写一个方法再加一个.var 就会生成返回值
        Person person = new Person(1, "wangsan");
        //拿到王三的号码
        System.out.println(person.getA());
        //设置王三的号码为3
        person.setA(3);
        //拿到王三的号码
        System.out.println(person.getA());
        //王三的行为
        person.playbasketball();


        Person lisi = new Person(2, "lisi");
        System.out.println(lisi.getA());
        lisi.setUsername("zhubajie");
        System.out.println(lisi.getUsername());

        animal animal = new animal("猴子", "樱桃小嘴");
        System.out.println(animal.banana());



    }
}