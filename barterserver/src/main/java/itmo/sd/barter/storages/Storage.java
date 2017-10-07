package itmo.sd.barter.storages;

/**
 * Basic interface for all storages.
 * @param <T> type of stored values.
 */
public interface Storage<T> {

    T create(T value);

    T update(T value);

    T delete(T value);

    Iterable<T> findAll();
}
