package nl.codered.glimf.dao;

import nl.codered.glimf.model.Drawer;
import nl.codered.glimf.model.Freezer;
import nl.codered.glimf.model.Item;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public final class MockDatabase {

    private static final Map<Long, Item> ITEMS = new HashMap<>();
    private static final Map<Long, Drawer> DRAWERS = new HashMap<>();
    private static final Map<Long, Freezer> FREEZERS = new HashMap<>();

    static {
        ITEMS.put(2131231L, new Item(2131231, "hamburgers", LocalDate.of(2018, Month.JULY, 4)));
        ITEMS.put(5467323L, new Item(5467323, "bread", LocalDate.of(2018, Month.JUNE, 16)));
        ITEMS.put(4525321L, new Item(4525321, "spinach", LocalDate.of(2018, Month.JULY, 18)));
        ITEMS.put(2345145L, new Item(2345145, "shrimps", LocalDate.of(2018, Month.APRIL, 25)));
        ITEMS.put(4232341L, new Item(4232341, "beef", LocalDate.of(2018, Month.JULY, 6)));
        ITEMS.put(1241252L, new Item(1241252, "chicken", LocalDate.of(2018, Month.JUNE, 3)));
        ITEMS.put(5846324L, new Item(5846324, "cheese", LocalDate.of(2017, Month.DECEMBER, 31)));

        DRAWERS.put(5124131L, new Drawer(5124131L, 1, "top", Arrays.asList(ITEMS.get(2131231L), ITEMS.get(5467323L))));
        DRAWERS.put(4252212L, new Drawer(4252212L, 2, "bottom", Arrays.asList(ITEMS.get(4525321L))));
        DRAWERS.put(4949621L, new Drawer(4949621L, 1, "top drawer", Arrays.asList(ITEMS.get(2345145L))));
        DRAWERS.put(2342428L, new Drawer(2342428L, 2, "middle drawer", Arrays.asList(ITEMS.get(4232341L), ITEMS.get(1241252L))));
        DRAWERS.put(5469646L, new Drawer(5469646L, 3, "bottom drawer", Arrays.asList(ITEMS.get(5846324L))));

        FREEZERS.put(41231244L, new Freezer(41231244L, "kitchen", Arrays.asList(DRAWERS.get(5124131L), DRAWERS.get(4252212L))));
        FREEZERS.put(69858451L, new Freezer(69858451L, "attic", Arrays.asList(DRAWERS.get(4949621L), DRAWERS.get(2342428L), DRAWERS.get(5469646L))));
    }

    private MockDatabase() {
    }

    public static List<Freezer> fetchFreezers() {
        return new ArrayList<>(FREEZERS.values());
    }

    public static Freezer fetchFreezer(long id) {
        return FREEZERS.get(id);
    }

    public static List<Drawer> fetchDrawers() {
        return new ArrayList<>(DRAWERS.values());
    }

    public static Drawer fetchDrawer(long id) {
        return DRAWERS.get(id);
    }

    public static List<Item> fetchItems() {
        return new ArrayList<>(ITEMS.values());
    }

    public static Item fetchItem(long id) {
        return ITEMS.get(id);
    }
}
