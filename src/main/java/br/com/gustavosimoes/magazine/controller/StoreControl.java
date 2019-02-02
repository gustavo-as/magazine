package br.com.gustavosimoes.magazine.controller;

import br.com.gustavosimoes.magazine.model.Store;
import br.com.gustavosimoes.magazine.service.StoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreControl {

    private static final Logger log = LoggerFactory.getLogger(StoreControl.class);

    @Autowired
    StoreService storeService;

    @GetMapping
    public List<Store> getAll(){
        return Arrays.asList(
                new Store("nome1", "endereco1"),
                new Store("nome2", "endereco2")
        );
    }

    @GetMapping("/{name}")
    public Store getByName(@PathVariable String name){
        try {
            return storeService.findByName(name);
        } catch (Exception e) {
            log.info("StoreControl.getByName -> " + e.getMessage());
            return null;
        }
    }

    @PostMapping
    public Store post(@RequestBody Store store){
        return storeService.save(store);
    }

    @PutMapping("/{name}")
    public Store put(@PathVariable String name, @RequestBody Store store){
        store.setName(store.getName() + " updated!");
        return store;
    }


}
