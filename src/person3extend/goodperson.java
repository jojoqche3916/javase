package person3extend;

public class goodperson extends person{
    public goodperson(){

    }

    public goodperson(int number, String username) {
        super(number, username);
    }

    //null
    //step
    public void doing(){
        System.out.println("z做好事");
    }
}
