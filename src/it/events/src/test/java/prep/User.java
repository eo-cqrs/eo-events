package prep;

import io.github.eocqrs.events.Resource;

/**
 * @author Aliaksei Bialiauski (abialiauski.dev@gmail.com)
 * @since 0.0.0
 */
public interface User extends Resource<User> {

  int id();

  String username();
}
