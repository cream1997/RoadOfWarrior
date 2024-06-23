package com.cream.row.common;

import java.util.Objects;

public class Tuple3<V1, V2, V3> {
    public final V1 v1;
    public final V2 v2;
    public final V3 v3;

    public Tuple3(V1 v1, V2 v2, V3 v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple3<?, ?, ?> tuple3 = (Tuple3<?, ?, ?>) o;
        return Objects.equals(v1, tuple3.v1) && Objects.equals(v2, tuple3.v2) && Objects.equals(v3, tuple3.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }

    @Override
    public String toString() {
        return "Tuple3{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
}
