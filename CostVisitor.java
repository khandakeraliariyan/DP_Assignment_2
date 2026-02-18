public class CostVisitor implements VillageVisitor {

    private double totalCost = 0;

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void visit(SimpleShape shape) {
        totalCost += shape.getCost();
    }

    @Override
    public void visit(CompositeComponent composite) {}
}
