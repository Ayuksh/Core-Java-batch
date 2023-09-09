package abstraction;

public class AmazonApp implements MiniTV , AmazonFresh {
    @Override
    public void watchTVShows() {
        System.out.println("WATCHING TV SHOWS !!");
    }

    @Override
    public void buyGrocery() {
        System.out.println("BUYING GROCERY !!");
    }

    @Override
    public void buyVegetables() {
        System.out.println("BUYING VEGETABLES !!");
    }

    public void buyAnyProduct()
    {
        System.out.println("BUYING ANYTHING !!");
    }
}
