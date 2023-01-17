package person;

public class plant {
    private int r;
    private String leaves;//"叶子";
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getMoving() {
        return leaves;
    }

    public void setMoving(String moving) {
        this.leaves = moving;
    }



    public plant(int r, String leaves) {
        this.r = r;
        this.leaves = leaves;
    }
    public String moving(){
        return "植物的叶子飘动";
    }


}
