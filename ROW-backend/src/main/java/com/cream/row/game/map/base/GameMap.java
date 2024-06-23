package com.cream.row.game.map.base;

import com.cream.row.common.Tuple2;
import com.cream.row.game.map.Point;
import com.cream.row.utils.Randoms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class GameMap {

    private static final Logger log = LoggerFactory.getLogger(GameMap.class);
    private int width;
    private int height;
    /**
     * 地图坐标点
     */
    private final Map<Tuple2<Byte, Byte>, Point> xy2Point;
    /**
     * 地图的对象集合
     */
    private final Map<Long, MapObj> id2MapObj;

    public GameMap() {
        this.xy2Point = new HashMap<>();
        this.id2MapObj = new HashMap<>();
    }

    public void enter(MapObj obj, int x, int y) {
        Point point = getPoint(x, y);
        if (point == null) {
            log.error("进入地图坐标点不合法");
            // 随机进入一个点
            point = Randoms.randomOne(xy2Point.values());
            Objects.requireNonNull(point);
        }
        obj.setXY(point.x, point.y);
        id2MapObj.put(obj.id, obj);
        point.addObj(obj.id);
    }

    public Point getPoint(int x, int y) {
        Tuple2<Byte, Byte> pointKey = new Tuple2<>((byte) x, (byte) y);
        return xy2Point.get(pointKey);
    }
}
