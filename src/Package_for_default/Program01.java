package Package_for_default;

 class Program01 {
    Program01(){
        System.out.println("Default Constructor");
    }
    String a = "default String ";
    void show(){
        System.out.println("Default Method : ");
    }
}
class program{
    public static void main(String[] args) {
        Program01 p = new Program01();
        System.out.println(p.a);
        p.show();

    }
}
