package com.kodilla.events.controller;

import com.kodilla.events.domain.DataDto;
import com.kodilla.events.event.DataRegisteredEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")
public class CalculatorController implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @PostMapping(path = "calc")
    public void add(@RequestBody DataDto dataDto) {
        log.info("Value A: " + dataDto.getDataA());
        log.info("Value B: " + dataDto.getDataB());
        log.info("Option: " + dataDto.getOption());
        publisher.publishEvent(
                new DataRegisteredEvent(
                        this,
                        dataDto.getDataA(),
                        dataDto.getDataB(),
                        dataDto.getOption()));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
