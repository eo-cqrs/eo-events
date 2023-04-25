package io.github.eocqrs.qce;

/**
 * The simple domain object, "unit" of the domain.
 *
 * @author Ivan Ivanchuk(l3r8y@duck.com)
 * @since 0.0.0
 */
public interface DomainObject<T extends DomainObject> {

    void apply(Aggregate<T> aggregate);

}
