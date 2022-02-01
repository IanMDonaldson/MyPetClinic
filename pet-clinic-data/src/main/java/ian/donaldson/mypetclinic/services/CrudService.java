package ian.donaldson.mypetclinic.services;

import java.util.Set;

/*
* all services will extend this since they all have the same behavior
* */
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
