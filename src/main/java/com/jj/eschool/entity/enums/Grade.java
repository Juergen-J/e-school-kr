package com.jj.eschool.entity.enums;

public enum Grade {

    FIFE(5),
    VOUR(4),
    THREE(3),
    TWO(2),
    ONE(1);

    private final int value;

    Grade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
