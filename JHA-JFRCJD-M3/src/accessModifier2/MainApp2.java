package accessModifier2;

import accessModifier.Demo;
import accessModifier.MainApp1;

public class MainApp2 extends Demo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.publicMethod();
        new MainApp2().show();
    }

    public void show()
    {
        protectedMethod();
    }
}
