package com.test.example.demo;

public class Stamp {

    public Stamp() {

    }
    public Stamp(int id, String owner, String title) {
        this.id = id;
        this.owner = owner;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    int id;
    String owner;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;

}
