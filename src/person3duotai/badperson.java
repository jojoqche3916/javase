package person3duotai;

public class badperson extends person{
    public badperson() {
    }

    public badperson(int number, String username) {
        super(number, username);
    }

    public void commonthing(){
        System.out.println("人在飞机上运动");
    }
}
