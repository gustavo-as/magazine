package br.com.gustavosimoes.magazine.service.impl;

import br.com.gustavosimoes.magazine.model.Store;
import br.com.gustavosimoes.magazine.repository.StoreRepository;
import br.com.gustavosimoes.magazine.service.StoreService;
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
    public Store save(Store entity) {
        return storeRepository.save(entity);
    }

    @Override
    public Store findById(Long id) {
        return storeRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        storeRepository.deleteById(id);
    }

    @Override
    public List<Store> findAll() {
        return (List<Store>) storeRepository.findAll();
    }

    @Override
    public Store update(Store store) {
        if (storeRepository.findById(store.getId()).isPresent()) {
            return storeRepository.save(store);
        }
        return null;
    }

    @Override
    public Store findByName(String name) {
        return storeRepository.findByName(name);
    }
}
