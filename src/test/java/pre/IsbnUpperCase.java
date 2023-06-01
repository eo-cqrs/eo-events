package pre;

import io.github.eocqrs.events.Event;
import lombok.RequiredArgsConstructor;

import java.util.Locale;

/**
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
@RequiredArgsConstructor
@SuppressWarnings("JTCOP.RuleAllTestsHaveProductionClass")
public final class IsbnUpperCase implements Event<Book> {

  private final String value;

  @Override
  public Book value(final Book book) {
    return new Book.Default(this.value.toUpperCase(Locale.ROOT));
  }

  @Override
  public String payload() {
    return "isbn upper cased -> %s"
      .formatted(
        this.value
      );
  }
}
