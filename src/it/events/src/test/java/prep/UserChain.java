package prep;

import io.github.eocqrs.events.Event;
import io.github.eocqrs.events.EventChain;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.Set;

/**
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
@RequiredArgsConstructor
public final class UserChain implements EventChain<User> {

  private final Set<Event<User>> events;

  @Override
  public Set<Event<User>> value() {
    return Collections.unmodifiableSet(this.events);
  }

  @Override
  public EventChain<User> append(final Event<User> event) {
    this.events.add(event);
    return new UserChain(this.events);
  }
}
