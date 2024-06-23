package com.cream.row.game.map;

import java.util.HashSet;
import java.util.Set;

public class Point {

    public final byte x;
    public final byte y;
    private final Set<Long> allObjId;
    // 标识是否是阻挡点
    private boolean block;

    public Point(int x, int y) {
        this.x = (byte) x;
        this.y = (byte) y;
        this.allObjId = new HashSet<>();
    }

    public void addObj(long objId) {
        allObjId.add(objId);
    }
}
