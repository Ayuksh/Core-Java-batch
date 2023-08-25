package inhertanceProgram;

public class MainApp10 {
    public static void main(String[] args) {
        ICE i1 = new ICE();
        System.out.println(i1.formula);
        i1.stateOfWater();
        System.out.println("--------------------------");
        GAS g1 = new GAS();
        System.out.println(g1.formula);
        g1.stateOfWater();

    }
}
