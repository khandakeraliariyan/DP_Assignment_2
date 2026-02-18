public class ResourceVisitor implements VillageVisitor {

    private int totalResources = 0;

    public int getTotalResources() {
        return totalResources;
    }

    @Override
    public void visit(SimpleShape shape) {
        totalResources += shape.getResource();
    }

    @Override
    public void visit(CompositeComponent composite) {
        // Nothing extra needed
    }
}
