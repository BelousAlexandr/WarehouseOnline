package com.itechart.warehouse.core.client;

import java.io.Serializable;

public enum State implements Serializable {
    ACTIVE("active"), SUSPENDED("suspended");

    private final String state;
    State(String state) { this.state = state; }
    public String getState() { return state; }

    public static State findByKey(String key) {
        State[] enums = State.values();
        for (State enumEntry : enums) {
            if (enumEntry.state.equals(key)) {
                return enumEntry;
            }
        }
        return null;
    }
}
