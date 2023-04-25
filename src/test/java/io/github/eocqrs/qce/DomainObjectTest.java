package io.github.eocqrs.qce;

import org.junit.jupiter.api.Test;

class DomainObjectTest {

    @Test
    void proofOfConcept() {
        final DomainObject<User> user = new User("john doe");
        final Aggregate<User> userAggregate = new UserAggregate(
            new PrintUser(),
            new UserUpdateName("not john doe")
        );
        user.apply(userAggregate);
        user.states().forEach(
            (load, state) -> System.out.printf("load: %s, state: %s%n", load, state)
        );
    }
}
