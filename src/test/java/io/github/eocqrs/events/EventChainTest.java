package io.github.eocqrs.events;

import org.cactoos.set.SetOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import pre.Book;
import pre.BookChain;
import pre.IsbnUpperCase;

/**
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
public final class EventChainTest {

  @Test
  void createsChain() {
    final EventChain<Book> chain = new BookChain(new SetOf<>());
    MatcherAssert.assertThat(
      "Chain is not null",
      chain,
      Matchers.notNullValue()
    );
  }

  @Test
  void appendsEventsToChain() {
    final EventChain<Book> chain = new BookChain(new SetOf<>());
    final EventChain<Book> after = chain.append(new IsbnUpperCase("test"));
    MatcherAssert.assertThat(
      "Event is appended to the chain",
      after.value(),
      Matchers.hasSize(1)
    );
  }
}
