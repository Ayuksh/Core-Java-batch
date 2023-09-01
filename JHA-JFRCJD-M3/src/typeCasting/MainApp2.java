package typeCasting;

public class MainApp2 {
    public static void main(String[] args) {

        Demo d1 = new Demo() ;

        Sample s1 = new Sample() ;

        Sample s2 = new Demo();
        Demo d2 = null ;
        if(s2 instanceof Demo)
             d2  =  (Demo) s2 ;
        d2.superMethod();
        d2.subMethod();


    }
}
