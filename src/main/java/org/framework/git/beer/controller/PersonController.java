package org.framework.git.beer.controller;

import org.framework.git.beer.document.Person;
import org.framework.git.beer.service.GenericInterfaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController implements GenericInterfaceController<Person> {

    private final GenericInterfaceService<Person> interfaceService;

    public PersonController(GenericInterfaceService<Person> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    public List<Person> findAll() {
        return interfaceService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> findById(@PathVariable String id) {
        return interfaceService.findById(id);
    }

    @PostMapping
    public Person save(@RequestBody Person person) {
        return interfaceService.save(person);
    }

    @PutMapping("/{id}")
    public Person update(@RequestBody Person person) {
        return interfaceService.update(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        interfaceService.delete(id);
    }
}
