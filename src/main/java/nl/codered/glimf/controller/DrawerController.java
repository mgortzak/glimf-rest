package nl.codered.glimf.controller;

import nl.codered.glimf.dao.DrawerDao;
import nl.codered.glimf.model.Drawer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrawerController {

    @Autowired
    private DrawerDao drawerDao;

    @RequestMapping("/drawers")
    public List<Drawer> fetchDrawer() {
        return drawerDao.fetchDrawers();
    }
}
