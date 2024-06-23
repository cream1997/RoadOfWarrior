package com.cream.row.common;

import java.util.Objects;

public class Tuple2<V1, V2> {
    public final V1 v1;
    public final V2 v2;

    public Tuple2(V1 v1, V2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple2<?, ?> tuple2 = (Tuple2<?, ?>) o;
        return Objects.equals(v1, tuple2.v1) && Objects.equals(v2, tuple2.v2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2);
    }

    @Override
    public String toString() {
        return "Tuple2{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                '}';
    }
}
