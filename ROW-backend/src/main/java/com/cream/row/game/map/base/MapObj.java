package com.cream.row.game.map.base;

import lombok.Getter;
import lombok.Setter;

public abstract class MapObj {

    public final long id;
    @Getter
    @Setter
    private String name;
    private int x;
    private int y;

    public MapObj(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
