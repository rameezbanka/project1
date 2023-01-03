public class Exception_A {


    public static void main(String[] args) {

            try{
                int x = 10/0;
            }catch(Exception e){
                System.out.println(e);
            }

        System.out.println("hello world");
    }
}
