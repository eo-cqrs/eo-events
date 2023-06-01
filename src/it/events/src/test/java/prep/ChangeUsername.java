package prep;

import io.github.eocqrs.events.Event;
import lombok.RequiredArgsConstructor;

/**
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
@RequiredArgsConstructor
public final class ChangeUsername implements Event<User> {

  private final String name;

  @Override
  public User submitTo(final User user) {
    return new EnUser(user.id(), this.name);
  }

  @Override
  public String payload() {
    return "new username will be: %s"
      .formatted(
        this.name
      );
  }
}
