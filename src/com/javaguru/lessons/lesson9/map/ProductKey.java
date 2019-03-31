package com.javaguru.lessons.lesson9.map;

import java.util.Objects;
import java.util.Random;

class ProductKey {

    private int code;
    private String id;

    public ProductKey(int code, String id) {
        this.code = code;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductKey{" +
                "code=" + code +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductKey that = (ProductKey) o;
        return code == that.code &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, id);
    }
}
