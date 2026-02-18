public class Main {

    public static void main(String[] args) {

        CompositeComponent village = new CompositeComponent("Village");

        village.add(HouseFactory.createBrickHouse());
        village.add(TreeFactory.createMangoTree());
        village.add(WaterSourceFactory.createSwimmingPool());

        CostVisitor costVisitor = new CostVisitor();
        village.accept(costVisitor);
        System.out.println("Total Cost: " + costVisitor.getTotalCost());

        ResourceVisitor resourceVisitor = new ResourceVisitor();
        village.accept(resourceVisitor);
        System.out.println("Total Resources: " + resourceVisitor.getTotalResources());

        ReportVisitor reportVisitor = new ReportVisitor();
        village.accept(reportVisitor);
        System.out.println("\nVillage Report:");
        System.out.println(reportVisitor.getReport());
    }
}
