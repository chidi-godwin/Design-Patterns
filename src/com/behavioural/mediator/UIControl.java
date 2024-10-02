package com.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private final List<Event> events = new ArrayList<>();

    public void addEvents(Event event) {
        events.add(event);
    }

    protected void triggerEvents() {
        for (var event: events)
            event.handle();
    }
}
