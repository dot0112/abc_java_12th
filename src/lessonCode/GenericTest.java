package lessonCode;

public class GenericTest<T> {
    T genericVar;
    T[] genericArray;

    GenericTest(T var) {
        genericVar = var;
//        genericArray = new T[3];
    }
}
