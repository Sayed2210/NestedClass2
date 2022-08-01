public class NestedClass2 {
    public static void main(String[] args) {
        Myfun();

    }
    public static void Myfun(){
        class B{
            public void info(){
                System.out.println("B");
            }
        }
        var b=new B();
        b.info();

    }
}
