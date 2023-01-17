import person.Person;
import person.animal;
import person.plant;
import person2.*;

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
//new 对象（）.var
        plant plant = new plant(51, "椰子树叶");
        System.out.println(plant.moving());//c触发l类d的x行为
        System.out.println(plant.getR()+plant.getMoving());//c触发l类d的s属性


        //day2
        //无参构造
        People people = new People();
        System.out.println(people.getA()+people.getUsername());
        people.setA(2);
        people.setUsername("zhanmusi");
        //触发类的属性
        System.out.println(people.getA()+people.getUsername());
        //触发类的行为
        System.out.println(people.playbasketball());


        //z总结：
        /*
        无参构造函数：new对象的时候不需要传入参数，你需要使用什么东西你就传入，然后直接调用h获取l类的s属性h或者d调用l类的x行为即可。
        有参构造函数：new对象的时候必须传入参数，然后直接调用获取属性或者调用类的行为即可。
         */

        //l类z中l类：l类z中h含有l另外y一个l类：：z针对l类的s属性z做w文章d的
        //l类的s属性d代表z只有q球h号h和x姓名，，d但是w我现在y要的是h还要z知道s所属x学校h和哪个b班级
        /*
        * j解决1：z在z这个类z中jj继续j加入l类的s属性  --》》100g个x学生n你写100c次j加入l类的s属性。。n你要x写200c次。。
        * j解决2：z再c创建y一个l类，，r然后y有需要n你就b把它j加入s属性，，100c次。。
        * */
        //类中类创建对象：
        //wucan ctrl+shift+/
       /* Peopletwo peopletwo = new Peopletwo();
        peopletwo.setA(1);
        peopletwo.setUsername("zhanmusi");
        System.out.println(peopletwo.getA()+peopletwo.getUsername());
        schoolandclass schoolandclass = new schoolandclass();
        schoolandclass.setSchoolname("yalizhongxue");
        schoolandclass.setClassnumber(2);
        peopletwo.setSchoolandclass(schoolandclass);
        System.out.println(peopletwo.getSchoolandclass().getSchoolname()+peopletwo.getSchoolandclass().getClassnumber()+peopletwo.getA()+peopletwo.getUsername());
*/
        //youcan
/*        schoolandclass schoolandclass = new schoolandclass();
        schoolandclass.setSchoolname("yalizhongxue");
        schoolandclass.setClassnumber(2);*/
        /*schoolandclass schoolandclass = new schoolandclass("yalizhongxue",2);*/
/*        Peopletwo peopletwo = new Peopletwo();
        peopletwo.setA(1);
        peopletwo.setUsername("zhanmusi");*/
/*        Peopletwo peopletwo = new Peopletwo(1,"zhanmusi",schoolandclass);*/
        Peopletwo peopletwo = new Peopletwo(1,"zhanmusi",new schoolandclass("yalizhongxue",2));
        System.out.println(peopletwo.getA()+peopletwo.getUsername());

    /*    peopletwo.setSchoolandclass(schoolandclass);*/
        System.out.println(peopletwo.getSchoolandclass().getSchoolname()+peopletwo.getSchoolandclass().getClassnumber()+peopletwo.getA()+peopletwo.getUsername());


        animaltwo animaltwo = new animaltwo("huahua", "daxingxing", new animalzoo("zhongguo", "beijingdongwuyuan"));
        System.out.println(animaltwo.getAnimalzoo().getLocation()+animaltwo.getMonkeyname()+animaltwo.getMonkeytype()+animaltwo.getAnimalzoo().getZooname());

//异常：程序出现错误就会异常，然后会有异常处理方式，，j监听s使用try  异常c处理gf方式s使用catch ctrl+alt+tT command+option+t
        try {
            /*int z=1/0;*/
        } catch (Exception e) {
            System.out.println("程序出错");
            throw new RuntimeException(e);//解释原因
        }
    }}