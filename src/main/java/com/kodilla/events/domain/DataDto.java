package com.kodilla.events.domain;

import com.kodilla.events.enums.Option;

public class DataDto {
    private int dataA;
    private int dataB;
    private Option option;

    public DataDto(int dataA, int dataB, Option option) {
        this.dataA = dataA;
        this.dataB = dataB;
        this.option = option;
    }

    public int getDataA() {
        return dataA;
    }

    public int getDataB() {
        return dataB;
    }

    public Option getOption() {
        return option;
    }
}
