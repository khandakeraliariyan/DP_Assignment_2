import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements VillageComponent {

    private String name;
    private List<VillageComponent> children = new ArrayList<>();

    public CompositeComponent(String name) {
        this.name = name;
    }

    public void add(VillageComponent component) {
        children.add(component);
    }

    public String getName() {
        return name;
    }

    public List<VillageComponent> getChildren() {
        return children;
    }

    @Override
    public void accept(VillageVisitor visitor) {
        visitor.visit(this);
        for (VillageComponent child : children) {
            child.accept(visitor);
        }
    }
}
