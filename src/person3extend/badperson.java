package person3extend;

public class badperson extends person{

    public badperson() {
    }

    public badperson(int number, String username) {
        super(number, username);
    }

    public  void doing(){
        System.out.println("t偷东西");
    }
}
