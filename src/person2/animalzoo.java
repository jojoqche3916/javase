package person2;

public class animalzoo {
    private String location;
    private String zooname;

    public animalzoo(){

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public animalzoo(String location, String zooname) {
        this.location = location;
        this.zooname = zooname;
    }
}
