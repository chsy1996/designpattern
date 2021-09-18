package behaviormodel.strategypattern;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
