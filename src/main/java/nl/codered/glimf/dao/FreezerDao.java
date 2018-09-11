package nl.codered.glimf.dao;

import nl.codered.glimf.model.Freezer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FreezerDao {
    public List<Freezer> fetchFreezers() {
        return MockDatabase.fetchFreezers();
    }

    public Freezer fetchFreezer(long id) {
        return MockDatabase.fetchFreezer(id);
    }
}
