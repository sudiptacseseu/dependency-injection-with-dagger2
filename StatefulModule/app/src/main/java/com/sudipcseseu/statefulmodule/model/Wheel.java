package com.sudipcseseu.statefulmodule.model;

public class Wheel {
    // Suppose we don't own this class so we can't annotate it with @Inject
    private Rim rim;
    private Tire tire;
    public Wheel(Rim rim, Tire tire) {
        this.rim = rim;
        this.tire = tire;
    }
}
