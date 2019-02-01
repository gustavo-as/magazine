package br.com.gustavosimoes.magazine.repository;

import br.com.gustavosimoes.magazine.model.Store;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StoreRepository extends PagingAndSortingRepository<Store, Long> {

    Store findByName(String name);

}
