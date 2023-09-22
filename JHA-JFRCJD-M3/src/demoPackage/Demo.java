package demoPackage;

public class Demo  {
    public static void main(String[] args) {
        String s = "java ";
        System.out.println( s.length() );
        System.out.println( s.hashCode() );
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


