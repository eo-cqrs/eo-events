package io.github.eocqrs.qce;

import java.util.Set;

public class UserAggregate implements Aggregate<User> {

    private final Set<Event<User>> events;

    @SafeVarargs
    public UserAggregate(Event<User>... events) {
        this.events = Set.of(events);
    }

    @Override
    public Set<Event<User>> value() {
        return this.events;
    }
}
