package br.com.gustavosimoes.magazine.service;

import br.com.gustavosimoes.magazine.exception.ServiceException;
import br.com.gustavosimoes.magazine.model.Store;
import br.com.gustavosimoes.magazine.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    protected StoreRepository storeRepository;

    @Override
    @Transactional
    public void save(Store entity) {

    }

    @Override
    @Transactional
    public Store findById(Long id) throws Exception {
        return storeRepository.findById(id).orElseThrow(() ->
                new ServiceException(String.format("Store not found. %s", id)));
    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    @Transactional
    public void save(List<Store> entities) {

    }

    @Override
    @Transactional
    public List<Store> findByIds(List<Long> ids) {
        return null;
    }

    @Override
    @Transactional
    public List<Store> findAll() {
        return null;
    }

    @Override
    @Transactional
    public void delete(List<Long> ids) {

    }

    @Override
    @Transactional
    public Store findByName(String name) throws Exception {
        Store store = storeRepository.findByName(name);
        if(store != null)
            return store;
        throw new ServiceException(String.format("Store not found. %s", name));
    }
}
