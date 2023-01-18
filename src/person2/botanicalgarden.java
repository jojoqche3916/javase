package person2;

public class botanicalgarden {
    private String gardenname;
    private String gardenpart;

    public botanicalgarden(){

    }

    public String getGardenname() {
        return gardenname;
    }

    public void setGardenname(String gardenname) {
        this.gardenname = gardenname;
    }

    public String getGardenpart() {
        return gardenpart;
    }

    public void setGardenpart(String gardenpart) {
        this.gardenpart = gardenpart;
    }

    public botanicalgarden(String gardenname, String gardenpart) {
        this.gardenname = gardenname;
        this.gardenpart = gardenpart;
    }
}
