package io.github.eocqrs.qce;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

final class DomainObjectTest {

    @Test
    void profOfConcept() {
        MatcherAssert.assertThat(
            new RegisteredUser("my name", "my password").asEvent().payload(),
            Matchers.equalTo("my namemy password")
        );
    }

    private record UserRegistration(RegisteredUser registeredUser) implements Event {
            @Override
            public String payload() {
                // Some payload here
                return this.registeredUser.name + this.registeredUser.password;
            }

            @Override
            public void commit(Aggregate aggregate) {
                // Submit an aggreate
            }
        }

    private record RegisteredUser(String name, String password)
        implements DomainObject<UserRegistration> {
            @Override
            public UserRegistration asEvent() {
                return new UserRegistration(this);
            }
        }
}
