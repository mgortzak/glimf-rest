package nl.codered.glimf.dao;

import nl.codered.glimf.model.Drawer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DrawerDao {
    public List<Drawer> fetchDrawers() {
        return MockDatabase.fetchDrawers();
    }

    public Drawer fetchDrawer(long id) {
        return MockDatabase.fetchDrawer(id);
    }
}
