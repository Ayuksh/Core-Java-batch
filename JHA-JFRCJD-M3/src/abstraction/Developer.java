package abstraction;

public class Developer implements Employee{

    @Override
    public void getDesignation() {
        System.out.println("DESIGNATION IS JR. DEVELOPER");
    }

    @Override
    public void getJob() {
        System.out.println("JOB IS TO DEVELOP SMALL APPLICATIONS");
    }
}
