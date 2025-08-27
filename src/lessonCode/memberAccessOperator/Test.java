package lessonCode.memberAccessOperator;

public class Test {
    int intVar;

    Test(int intVar) {
        this.intVar = intVar;
    }

    Test getThis() {
        return this;
    }

    Test getNew() {
        return new Test(this.intVar);
    }

    int getIntVar() {
        return intVar;
    }

    Test setIntVar(int intVar) {
        this.intVar = intVar;
        return this;
    }

    String getIntVarString() {
        return String.valueOf(intVar);
    }
}
