package com.sudipcseseu.subcomponent.model;

public class Driver {
    //Suppose, we don't own this class so we can't annotate it with @Inject

    String name;
    public Driver(String name) {
        this.name = name;
    }
}
