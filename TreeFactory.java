public class TreeFactory {

    public static CompositeComponent createMangoTree() {
        CompositeComponent tree = new CompositeComponent("Mango Tree");
        tree.add(new SimpleShape("Hard Stem", 150, 20));
        tree.add(new SimpleShape("Mango Leaves", 200, 25));

        return tree;
    }

    public static CompositeComponent createBananaTree() {
        CompositeComponent tree = new CompositeComponent("Banana Tree");
        tree.add(new SimpleShape("Soft Stem", 100, 15));
        tree.add(new SimpleShape("Banana Leaves", 120, 18));

        return tree;
    }
}
