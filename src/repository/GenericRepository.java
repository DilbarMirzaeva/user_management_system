package repository;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<T> {

    Optional<T> findById(Long Id);
    List<T> findAll();
    void save(T entity);
    void update(Long Id,T entity);
    void delete(Long Id);
}
