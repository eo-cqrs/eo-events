package io.github.eocqrs.qce;

import java.util.Map;

/**
 * The simple domain object, "unit" of the domain.
 *
 * @author Ivan Ivanchuk(l3r8y@duck.com)
 * @since 0.0.0
 */
public interface DomainObject<T extends DomainObject> {

    void apply(Aggregate<T> aggregate);

    Map<String, T> states();
}
