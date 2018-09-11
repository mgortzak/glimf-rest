package nl.codered.glimf.model;

import java.time.LocalDate;

public class Item {

    private long id;
    private String name;
    private LocalDate registration;

    public Item() {
    }

    public Item(long id, String name, LocalDate registration) {
        this.id = id;
        this.name = name;
        this.registration = registration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public void setRegistration(LocalDate registration) {
        this.registration = registration;
    }
}
