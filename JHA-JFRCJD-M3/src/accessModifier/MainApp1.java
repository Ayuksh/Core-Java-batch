package accessModifier;

public class MainApp1 {
    public static void main(String[] args) {
        Demo d1 = new Demo() ;
        d1.packageMethod();
        d1.protectedMethod();
        d1.publicMethod();
    }
}
