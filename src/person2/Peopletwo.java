package person2;

public class Peopletwo {


        private int a;
        private String username;

        private schoolandclass schoolandclass;//类可以是数据类型进行引用

        //无参构造：每次new对象不需要传入参数
        public Peopletwo(){

        }

    public Peopletwo(int a, String username, person2.schoolandclass schoolandclass) {
        this.a = a;
        this.username = username;
        this.schoolandclass = schoolandclass;
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

    public person2.schoolandclass getSchoolandclass() {
        return schoolandclass;
    }

    public void setSchoolandclass(person2.schoolandclass schoolandclass) {
        this.schoolandclass = schoolandclass;
    }
}
