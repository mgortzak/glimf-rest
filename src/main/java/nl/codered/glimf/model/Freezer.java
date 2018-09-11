package nl.codered.glimf.model;

import java.util.List;

public class Freezer {
    private long id;
    private String name;
    private List<Drawer> drawers;

    public Freezer() {
    }

    public Freezer(long id, String name, List<Drawer> drawers) {
        this.id = id;
        this.name = name;
        this.drawers = drawers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Drawer> getDrawers() {
        return drawers;
    }

    public void setDrawers(List<Drawer> drawers) {
        this.drawers = drawers;
    }
}
