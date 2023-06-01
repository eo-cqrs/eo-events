package pre;

import io.github.eocqrs.events.Resource;
import lombok.RequiredArgsConstructor;

/**
 * @author Aliaksei Bialiauski (abialaiuski.dev@gmail.com)
 * @since 0.0.0
 */
@SuppressWarnings("JTCOP.RuleAllTestsHaveProductionClass")
public interface Book extends Resource<Book> {

  String isbn();

  @RequiredArgsConstructor
  final class Default implements Book {

    private final String isbn;

    @Override
    public String isbn() {
      return this.isbn;
    }
  }
}
