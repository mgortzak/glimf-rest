package nl.codered.glimf.dao;

import nl.codered.glimf.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDao {
    public List<Item> fetchItems() {
        return MockDatabase.fetchItems();
    }
}
