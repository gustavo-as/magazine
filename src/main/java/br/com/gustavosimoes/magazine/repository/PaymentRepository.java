package br.com.gustavosimoes.magazine.repository;

import br.com.gustavosimoes.magazine.model.Payment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentRepository extends PagingAndSortingRepository<Payment, Long> {
}
