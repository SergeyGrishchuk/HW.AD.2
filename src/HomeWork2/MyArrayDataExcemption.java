package HomeWork2;

public class MyArrayDataExcemption extends RuntimeException{
    private int abc;
    private int xyz;

    public int getAbc() {
        return abc;
    }

    public int getXyz() {
        return xyz;
    }

    public MyArrayDataExcemption(String message, int abc, int xyz) {
        super(message);
        this.abc = abc;
        this.xyz = xyz;
    }
}
