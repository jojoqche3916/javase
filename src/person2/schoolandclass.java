package person2;

public class schoolandclass {

    private String schoolname;

    private int classnumber;

    public schoolandclass(){

    }

    public schoolandclass(String schoolname, int classnumber) {
        this.schoolname = schoolname;
        this.classnumber = classnumber;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public int getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(int classnumber) {
        this.classnumber = classnumber;
    }
}
