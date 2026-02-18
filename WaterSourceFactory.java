public class WaterSourceFactory {

    public static CompositeComponent createSwimmingPool() {
        CompositeComponent pool = new CompositeComponent("Swimming Pool");
        pool.add(new SimpleShape("Water Area", 400, 40));
        pool.add(new SimpleShape("Tile Boundary", 200, 15));

        return pool;
    }

    public static CompositeComponent createPond() {
        CompositeComponent pond = new CompositeComponent("Pond");
        pond.add(new SimpleShape("Natural Water", 150, 25));
        pond.add(new SimpleShape("Natural Boundary", 80, 10));

        return pond;
    }
}
