package person2;

public class animaltwo {
    private String monkeyname;
    private String monkeytype;

    private animalzoo animalzoo;

    public animaltwo(){

    }

    public animaltwo(String monkeyname, String monkeytype, animalzoo animalzoo) {
        this.monkeyname = monkeyname;
        this.monkeytype = monkeytype;
        this.animalzoo = animalzoo;
    }

    public String getMonkeyname() {
        return monkeyname;
    }

    public void setMonkeyname(String monkeyname) {
        this.monkeyname = monkeyname;
    }

    public String getMonkeytype() {
        return monkeytype;
    }

    public void setMonkeytype(String monkeytype) {
        this.monkeytype = monkeytype;
    }

    public animalzoo getAnimalzoo() {
        return animalzoo;
    }

    public void setAnimalzoo(animalzoo animalzoo) {
        this.animalzoo = animalzoo;
    }
}
