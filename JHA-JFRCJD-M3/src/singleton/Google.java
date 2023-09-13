package singleton;

public class Google {
    private static Google g1 ;

    private Google(){
        System.out.println("CONSTRUCTOR ");
    }

    public static Google createAccount(){
        if (g1==null)           // single ton condition
            g1 = new Google() ;
        return g1 ;
    }

    public void gmail()
    {
        System.out.println("ACCESSING GMAIL !!");
    }

    public void youtube()
    {
        System.out.println("ACCESSING YOUTUBE !! ");
    }

    public void googleNews()
    {
        System.out.println("ACCESSING GOOGLE NEWS !!");
    }

}
