package org.framework.git.beer.controller;

import org.framework.git.beer.document.ShoppingDetail;
import org.framework.git.beer.service.GenericInterfaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shoppingDetail")
public class ShoppingDetailController implements GenericInterfaceController<ShoppingDetail> {

    private final GenericInterfaceService<ShoppingDetail> interfaceService;

    public ShoppingDetailController(GenericInterfaceService<ShoppingDetail> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    public List<ShoppingDetail> findAll() {
        return interfaceService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ShoppingDetail> findById(@PathVariable String id) {
        return interfaceService.findById(id);
    }

    @PostMapping
    public ShoppingDetail save(ShoppingDetail shoppingDetail) {
        return interfaceService.save(shoppingDetail);
    }

    @PutMapping("/{id}")
    public ShoppingDetail update(ShoppingDetail shoppingDetail) {
        return interfaceService.save(shoppingDetail);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        interfaceService.delete(id);
    }
}
