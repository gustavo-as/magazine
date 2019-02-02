package br.com.gustavosimoes.magazine.repository;

import br.com.gustavosimoes.magazine.model.OrderItem;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderItemRepository extends PagingAndSortingRepository<OrderItem, Long> {
}
