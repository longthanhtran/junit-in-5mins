package com.mycompany;

import java.util.List;
import java.util.ArrayList;

public class Book {

    List me = new ArrayList();

    public Book(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}