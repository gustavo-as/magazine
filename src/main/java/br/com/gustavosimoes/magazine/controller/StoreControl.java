package br.com.gustavosimoes.magazine.controller;

import br.com.gustavosimoes.magazine.model.Store;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreControl {

    @GetMapping
    public List<Store> getAll(){
        return Arrays.asList(
                new Store("nome1", "endereco1"),
                new Store("nome2", "endereco2")
        );
    }

    @GetMapping("/{name}")
    public Store getByName(@PathVariable String name){
        return new Store(name, "Address of " + name);
    }

    @PostMapping
    public Store post(@RequestBody Store store){
        store.setName(store.getName() + " Saved!");
        return store;
    }

    @PutMapping("/{name}")
    public Store put(@PathVariable String name, @RequestBody Store store){
        store.setName(store.getName() + " updated!");
        return store;
    }


}
