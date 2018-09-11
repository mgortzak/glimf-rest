package nl.codered.glimf.controller;

import nl.codered.glimf.dao.FreezerDao;
import nl.codered.glimf.model.Freezer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FreezerController {

    @Autowired
    private FreezerDao freezerDao;

    @RequestMapping("/freezers")
    public List<Freezer> fetchFreezers() {
        return freezerDao.fetchFreezers();
    }
}
