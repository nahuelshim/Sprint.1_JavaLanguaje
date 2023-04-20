package N1Ex1;

public class NoGenericMethods  {

    private int num;
    private int num2;
    private int num3;

    public NoGenericMethods(int num, int num2, int num3) {
        this.num = num;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods: " +
                "num = " + num +
                ", num2 = " + num2 +
                ", num3 = " + num3;
    }
}
