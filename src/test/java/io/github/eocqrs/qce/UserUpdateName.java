package io.github.eocqrs.qce;

public record UserUpdateName(String update) implements Event<User> {

    @Override
    public User submitTo(User object) {
        // make update in database etc.
        return new User(this.update);
    }

    @Override
    public String payload() {
        return "Updated to %s at %d".formatted(this.update, System.currentTimeMillis());
    }
}
