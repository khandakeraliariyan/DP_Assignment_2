public class HouseFactory {

    public static CompositeComponent createBrickHouse() {
        CompositeComponent house = new CompositeComponent("Brick House");
        house.add(new SimpleShape("Brick Wall", 500, 50));
        house.add(new SimpleShape("Concrete Roof", 300, 30));
        house.add(new SimpleShape("Wooden Door", 100, 10));

        return house;
    }

    public static CompositeComponent createMudHouse() {
        CompositeComponent house = new CompositeComponent("Wooden House");
        house.add(new SimpleShape("Wood Wall", 200, 40));
        house.add(new SimpleShape("Tin Roof", 150, 20));
        house.add(new SimpleShape("Wood Door", 80, 8));

        return house;
    }
}
