public class ReportVisitor implements VillageVisitor {

    private StringBuilder report = new StringBuilder();

    public String getReport() {
        return report.toString();
    }

    @Override
    public void visit(SimpleShape shape) {
        report.append("- ")
                .append(shape.getName())
                .append(" (Cost: ")
                .append(shape.getCost())
                .append(", Resource: ")
                .append(shape.getResource())
                .append(")\n");
    }

    @Override
    public void visit(CompositeComponent composite) {
        report.append(composite.getName())
                .append("\n");
    }
}
