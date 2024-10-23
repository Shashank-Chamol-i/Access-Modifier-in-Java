package Package_for_private;

public class Program01 {
    private Program01(){
        System.out.println("I am inside the Constructor");
    }
    private int a = 96;
    private void show(){
        System.out.println("The value of a  is : "+a);
    }

    public static void main(String[] args) {
        Program01 p = new Program01();
        System.out.println(p.a);
        p.show();

    }
}
/*If i had create another class and accessed the member of private it gonna show me
* Compile time error */
