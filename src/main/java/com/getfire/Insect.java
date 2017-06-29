package com.getfire;

public abstract class Insect implements Attack {
    private static final int MIN_LEGS = 6;
    private static final int MIN_WINGS = 0;

    private int size;
    private String area;
    private int legs;
    private int wings;
    private boolean hasSting;

    public Insect() {
    }

    public Insect(String area) {
        this.area = area;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <= 0) {
            return;
        }
        this.size = size;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if (area.equals("")) {
            return;
        }
        this.area = area;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if (legs < MIN_LEGS) {
            return;
        }
        this.legs = legs;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        if (wings < MIN_WINGS) {
            return;
        }
        this.wings = wings;
    }

    public boolean isHasSting() {
        return hasSting;
    }

    public void setHasSting(boolean hasSting) {
        this.hasSting = hasSting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Insect insect = (Insect) o;

        if (size != insect.size) return false;
        if (legs != insect.legs) return false;
        if (wings != insect.wings) return false;
        if (hasSting != insect.hasSting) return false;
        return area.equals(insect.area);
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + area.hashCode();
        result = 31 * result + legs;
        result = 31 * result + wings;
        result = 31 * result + (hasSting ? 1 : 0);
        return result;
    }
}
