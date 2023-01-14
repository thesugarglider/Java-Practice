package com.sugarglider.javatips;

import java.util.Objects;

public class Example2 {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example2 example2 = (Example2) o;
        return id == example2.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private int id;

    Example2(int id){
        this.id =id;
    }
}
