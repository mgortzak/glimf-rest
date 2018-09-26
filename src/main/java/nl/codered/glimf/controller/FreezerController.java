package nl.codered.glimf.controller;

import nl.codered.glimf.dao.FreezerRepository;
import nl.codered.glimf.model.Freezer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreezerController {

    @Autowired
    private FreezerRepository freezerRepository;

    @PostMapping("/freezers")
    public Freezer addFreezer(@RequestBody Freezer freezer) {
        return freezerRepository.save(freezer);
    }

    @GetMapping("/freezers")
    public Iterable<Freezer> fetchFreezers() {
        return freezerRepository.findAll();
    }

    @GetMapping("/freezers/{id}")
    public Freezer fetchFreezer(@PathVariable("id") long id) {
        return freezerRepository.findById(id).get();
    }
}
