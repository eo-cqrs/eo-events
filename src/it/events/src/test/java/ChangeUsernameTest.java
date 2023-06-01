import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import prep.ChangeUsername;
import prep.EnUser;
import prep.User;

/**
 * Test case for {@link ChangeUsername}
 *
 * @author Aliaksei Bialiauski (abiliauski.dev@gmail.com)
 * @since 0.0.0
 */
final class ChangeUsernameTest {

  @Test
  void changesUsername() {
    final User user = new EnUser(1, "hialexbel");
    final String name = "h1alexbel";
    MatcherAssert.assertThat(
      "Name has changed",
      new ChangeUsername(name)
        .value(user)
        .username(),
      Matchers.equalTo(name)
    );
  }
}
