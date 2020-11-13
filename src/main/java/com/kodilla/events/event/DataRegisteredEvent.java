package com.kodilla.events.event;

import com.kodilla.events.enums.Option;
import org.springframework.context.ApplicationEvent;

public class DataRegisteredEvent extends ApplicationEvent {

    private int dataA;
    private int dataB;
    private Option option;

    public DataRegisteredEvent(Object source, int dataA, int dataB, Option option) {
        super(source);
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
