package lessonCode.array;

public class Test {
    private int intVal = 1;

    Test() {

    }

    Test(int intVal) {
        this.intVal = intVal;
    }

    void print() {
        System.out.println(intVal);
    }

    @Override
    public String toString() {
        return "!" + intVal * 2;
    }

    int getIntVal() {
        return intVal;
    }

    void setIntVal(int intVal) {
        this.intVal = intVal;
    }
}
