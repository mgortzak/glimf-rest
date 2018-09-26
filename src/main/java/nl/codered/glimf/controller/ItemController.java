package nl.codered.glimf.controller;

import nl.codered.glimf.dao.ItemRepository;
import nl.codered.glimf.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/items")
    public Item addItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @GetMapping("/items")
    public Iterable<Item> fetchItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/items/{id}")
    public Item fetchItem(@PathVariable("id") long id) {
        return itemRepository.findById(id).get();
    }
}
