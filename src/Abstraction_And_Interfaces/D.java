package Abstraction_And_Interfaces;

public class D extends B{
    @Override
    public void test1() {
        System.out.println("From test1");
    }

    public static void main(String[] args) {
        D d  = new D();
        d.test1();
        System.out.println(d.sum(12,4));
    }
}
