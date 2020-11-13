package com.kodilla.events.service;

import com.kodilla.events.enums.Option;
import com.kodilla.events.event.DataRegisteredEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CalculateManager implements ApplicationListener<DataRegisteredEvent> {

    @Override
    public void onApplicationEvent(DataRegisteredEvent event) {
        int result = 0;
        String operation = "";
        if (event.getOption() == Option.ADD) {
            result = event.getDataA() + event.getDataB();
            operation = " + ";
        }
        if (event.getOption() == Option.SUB) {
            result = event.getDataA() - event.getDataB();
            operation = " - ";
        }
        if (event.getOption() == Option.MULTIPLY) {
            result = event.getDataA() * event.getDataB();
            operation = " * ";
        }
        if (event.getOption() == Option.DIVIDE) {
            result = event.getDataA() / event.getDataB();
            operation = " / ";
        }
        log.info(event.getDataA() + operation + event.getDataB() + " = " + result);
    }

}