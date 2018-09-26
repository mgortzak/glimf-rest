package nl.codered.glimf.controller;

import nl.codered.glimf.dao.DrawerRepository;
import nl.codered.glimf.model.Drawer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrawerController {

    @Autowired
    private DrawerRepository drawerRepository;

    @PostMapping("/drawers")
    public Drawer addDrawer(@RequestBody Drawer drawer) {
        return drawerRepository.save(drawer);
    }

    @GetMapping("/drawers")
    public Iterable<Drawer> fetchDrawer() {
        return drawerRepository.findAll();
    }

    @GetMapping("/drawers/{id}")
    public Drawer fetchDrawer(@PathVariable("id") long id) {
        return drawerRepository.findById(id).get();
    }
}
