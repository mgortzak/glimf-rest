package nl.codered.glimf.controller;

import nl.codered.glimf.dao.ItemDao;
import nl.codered.glimf.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemDao itemDao;

    @RequestMapping("/items")
    public List<Item> fetchItems() {
        return itemDao.fetchItems();
    }
}
