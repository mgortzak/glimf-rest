package nl.codered.glimf.model;

import java.util.List;

public class Drawer {
    private long id;
    private int order;
    private String name;
    private List<Item> items;

    public Drawer() {
    }

    public Drawer(long id, int order, String name, List<Item> items) {
        this.id = id;
        this.order = order;
        this.name = name;
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
