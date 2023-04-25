package io.github.eocqrs.qce;

public record User(String name) implements DomainObject<User> {
    @Override
    public void apply(Aggregate<User> aggregate) {
        aggregate.value().forEach(userEvent -> userEvent.submitTo(this));
    }
}
