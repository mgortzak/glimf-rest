package nl.codered.glimf.dao;

import nl.codered.glimf.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {

}