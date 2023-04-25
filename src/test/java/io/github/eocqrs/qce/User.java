package io.github.eocqrs.qce;

import java.util.HashMap;
import java.util.Map;

public record User(String name) implements DomainObject<User> {

    private static final Map<String, User> STATES = new HashMap<>(0);

    @Override
    public void apply(Aggregate<User> aggregate) {
        aggregate.value().forEach(
            userEvent ->
                STATES.put(
                    userEvent.payload(),
                    userEvent.submitTo(this)
                )
        );
    }

    @Override
    public Map<String, User> states() {
        return User.STATES;
    }
}
