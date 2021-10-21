package org.framework.git.beer.controller;

import org.framework.git.beer.document.ShoppingCart;
import org.framework.git.beer.service.GenericInterfaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController implements GenericInterfaceController<ShoppingCart> {

    private final GenericInterfaceService<ShoppingCart> interfaceService;

    public ShoppingCartController(GenericInterfaceService<ShoppingCart> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    public List<ShoppingCart> findAll() {
        return interfaceService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ShoppingCart> findById(@PathVariable String id) {
        return interfaceService.findById(id);
    }

    @PostMapping
    public ShoppingCart save(ShoppingCart shoppingCart) {
        return interfaceService.save(shoppingCart);
    }

    @PutMapping("/{id}")
    public ShoppingCart update(ShoppingCart shoppingCart) {
        return interfaceService.save(shoppingCart);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        interfaceService.delete(id);
    }
}
