package io.github.eocqrs.qce;

import java.util.HashSet;
import java.util.Set;

public class UserAggregate implements Aggregate<User> {

    private final Set<Event<User>> events;

    public UserAggregate(Set<Event<User>> events) {
        this.events = events;
    }

    @SafeVarargs
    public UserAggregate(Event<User>... events) {
        this.events = Set.of(events);
    }

    @Override
    public Set<Event<User>> value() {
        return this.events;
    }

    @Override
    public Aggregate<User> append(Event<User> event) {
        final Set<Event<User>> updated = new HashSet<>(this.events);
        updated.add(event);
        return new UserAggregate(updated);
    }
}
