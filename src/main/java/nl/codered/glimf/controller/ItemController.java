package nl.codered.glimf.controller;

import nl.codered.glimf.dao.ItemDao;
import nl.codered.glimf.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemDao itemDao;

    @GetMapping("/items")
    public List<Item> fetchItems() {
        return itemDao.fetchItems();
    }

    @GetMapping("/items/{id}")
    public Item fetchItem(@PathVariable("id") long id) {
        return itemDao.fetchItem(id);
    }
}
