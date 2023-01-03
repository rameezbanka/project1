package Abstraction_And_Interfaces;

public class C implements A{

    @Override
    public void test() {
        System.out.println("From test");
    }

    public static void main(String[] args) {
        C c = new C();
        c.test();
    }
}
