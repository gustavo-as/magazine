package br.com.gustavosimoes.magazine.repository;

import br.com.gustavosimoes.magazine.model.Order;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
