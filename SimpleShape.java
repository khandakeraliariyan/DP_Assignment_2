public class SimpleShape implements VillageComponent {

    private String name;
    private double cost;
    private int resource;

    public SimpleShape(String name, double cost, int resource) {
        this.name = name;
        this.cost = cost;
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getResource() {
        return resource;
    }

    @Override
    public void accept(VillageVisitor visitor) {
        visitor.visit(this);
    }
}
