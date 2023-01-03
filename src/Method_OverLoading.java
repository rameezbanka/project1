public class Method_OverLoading {

    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int x, int y, int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        Method_OverLoading app = new Method_OverLoading();
        System.out.println(app.sum(19,45));
        System.out.println(app.sum(12,6,9));

    }
}
