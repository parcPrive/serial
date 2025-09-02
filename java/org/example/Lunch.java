package org.example;

import java.io.Serializable;

public class Lunch implements Serializable {

    private static final long serialVersionUID = 1L;
    private String menu;

    public Lunch(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
