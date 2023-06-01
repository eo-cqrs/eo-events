package prep;

import lombok.RequiredArgsConstructor;

/**
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
@RequiredArgsConstructor
public final class EnUser implements User {

  private final int id;
  private final String username;

  @Override
  public int id() {
    return this.id;
  }

  @Override
  public String username() {
    return this.username;
  }
}
