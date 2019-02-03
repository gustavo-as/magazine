package br.com.gustavosimoes.magazine.generic;

import java.util.List;

/**
 * Created by Gustavo Simões on 01/02/2019.
 * http://docs.oracle.com/javase/specs/jls/se7/html/jls-9.html#jls-9.4
 */
public interface GenericInterfaceOperations<E> {

    E save(final E entity);
    E findById(final Long id);
    void delete(final Long id);

    void save(final List<E> entities);
    List<E> findByIds(final List<Long> ids);
    List<E> findAll();
    void delete(final List<Long> ids);

}
