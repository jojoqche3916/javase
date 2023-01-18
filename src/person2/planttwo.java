package person2;

public class planttwo {
    private String plantname;
    private String plantflower;
    private botanicalgarden botanicalgarden;//这里是定义类

    public planttwo(){

    }

    public planttwo(String plantname, String plantflower, person2.botanicalgarden botanicalgarden) {
        this.plantname = plantname;
        this.plantflower = plantflower;
        this.botanicalgarden = botanicalgarden;
    }

    public String getPlantname() {
        return plantname;
    }

    public void setPlantname(String plantname) {
        this.plantname = plantname;
    }

    public String getPlantflower() {
        return plantflower;
    }

    public void setPlantflower(String plantflower) {
        this.plantflower = plantflower;
    }

    public person2.botanicalgarden getBotanicalgarden() {
        return botanicalgarden;
    }

    public void setBotanicalgarden(person2.botanicalgarden botanicalgarden) {
        this.botanicalgarden = botanicalgarden;
    }
}
