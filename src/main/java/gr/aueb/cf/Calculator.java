package gr.aueb.cf;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) throws Exception {

        if (b == 0) throw new Exception("div error");
        return a / b;
    }
}
