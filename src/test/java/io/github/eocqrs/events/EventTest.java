package io.github.eocqrs.events;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import pre.Book;
import pre.IsbnUpperCase;

import java.util.Locale;

/**
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
public final class EventTest {

  @Test
  void changesIsbn() {
    final String before = "test";
    final Book book = new Book.Default(before);
    final String after = new IsbnUpperCase(book.isbn())
      .value(book)
      .isbn();
    MatcherAssert.assertThat(
      "ISBN has changed",
      after,
      Matchers.equalTo(before.toUpperCase(Locale.ROOT))
    );
  }
}
