package br.com.gustavosimoes.magazine.service;

import br.com.gustavosimoes.magazine.exception.ServiceException;
import br.com.gustavosimoes.magazine.model.Store;
import br.com.gustavosimoes.magazine.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService{

    @Autowired
    protected StoreRepository storeRepository;

    @Override
    @Transactional
    public void save(Store entity) {

    }

    @Override
    public Store findById(Long id) throws Exception {
        return storeRepository.findById(id).orElseThrow(() ->
                new ServiceException(String.format("Store not found. %s", id)));
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void save(List<Store> entities) {

    }

    @Override
    public List<Store> findByIds(List<Long> ids) {
        return null;
    }

    @Override
    public List<Store> findAll() {
        return null;
    }

    @Override
    public void delete(List<Long> ids) {

    }
}
