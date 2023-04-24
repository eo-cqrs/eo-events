package io.github.eocqrs.qce;

/**
 * The simple domain object
 *
 * @param <E> The event type to produce
 */
public interface DomainObject<E extends Event> {

    /**
     * Domain object as event
     *
     * @return Domain object transformed to event
     */
    E asEvent();
}
