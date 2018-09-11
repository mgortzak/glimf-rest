package nl.codered.glimf.controller;

import nl.codered.glimf.dao.DrawerDao;
import nl.codered.glimf.model.Drawer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrawerController {

    @Autowired
    private DrawerDao drawerDao;

    @GetMapping("/drawers")
    public List<Drawer> fetchDrawer() {
        return drawerDao.fetchDrawers();
    }

    @GetMapping("/drawers/{id}")
    public Drawer fetchDrawer(@PathVariable("id") long id) {
        return drawerDao.fetchDrawer(id);
    }
}
