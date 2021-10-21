package org.framework.git.beer.controller;

import org.framework.git.beer.document.Business;
import org.framework.git.beer.service.GenericInterfaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/business")
public class BusinessController implements GenericInterfaceController<Business> {

    private final GenericInterfaceService<Business> interfaceService;

    public BusinessController(GenericInterfaceService<Business> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    public List<Business> findAll() {
        return interfaceService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Business> findById(@PathVariable String id) {
        return interfaceService.findById(id);
    }

    @PostMapping
    public Business save(Business business) {
        return interfaceService.save(business);
    }

    @PutMapping("/{id}")
    public Business update(Business business) {
        return interfaceService.save(business);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        interfaceService.delete(id);
    }
}
