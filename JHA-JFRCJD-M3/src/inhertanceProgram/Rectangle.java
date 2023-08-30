package inhertanceProgram;

public class Rectangle {
    int len ;
    int wid ;

    public Rectangle(int len, int wid) {
        this.len = len;
        this.wid = wid;
    }

    public void area()
    {
        System.out.println("AREA : "+ ( len* wid ));
    }

    public void parameter()
    {
        System.out.println("PARAMETER : "+ (2 * (len + wid)));
    }
}
