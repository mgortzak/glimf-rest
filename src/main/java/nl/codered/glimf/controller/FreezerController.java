package nl.codered.glimf.controller;

import nl.codered.glimf.dao.FreezerDao;
import nl.codered.glimf.model.Freezer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FreezerController {

    @Autowired
    private FreezerDao freezerDao;

    @GetMapping("/freezers")
    public List<Freezer> fetchFreezers() {
        return freezerDao.fetchFreezers();
    }

    @GetMapping("/freezers/{id}")
    public Freezer fetchFreezer(@PathVariable("id") long id) {
        return freezerDao.fetchFreezer(id);
    }
}
