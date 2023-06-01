package pre;

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
@SuppressWarnings("JTCOP.RuleAllTestsHaveProductionClass")
public final class BookChain implements EventChain<Book> {

  private final Set<Event<Book>> events;

  @Override
  public Set<Event<Book>> value() {
    return Collections.unmodifiableSet(this.events);
  }

  @Override
  public EventChain<Book> append(final Event<Book> event) {
    this.events.add(event);
    return new BookChain(this.events);
  }
}
