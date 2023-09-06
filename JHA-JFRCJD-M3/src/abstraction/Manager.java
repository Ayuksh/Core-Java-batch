package abstraction;

public class Manager implements Employee{

    @Override
    public void getDesignation() {
        System.out.println("DESIGNATION IS MANAGER");
    }

    @Override
    public void getJob() {
        System.out.println("JOB IS TO ASSIGN WORK TO EMPLOYEE ");
    }
}
