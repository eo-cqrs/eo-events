package io.github.eocqrs.qce;

public class PrintUser implements Event<User> {
    @Override
    public User submitTo(User object) {
        System.out.println(object);
        return object;
    }

    @Override
    public String payload() {
        return null;
    }
}
