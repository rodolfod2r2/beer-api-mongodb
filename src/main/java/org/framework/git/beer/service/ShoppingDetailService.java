package org.framework.git.beer.service;

import org.framework.git.beer.document.ShoppingDetail;
import org.framework.git.beer.repository.ShoppingDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingDetailService implements GenericInterfaceService<ShoppingDetail> {

    private final ShoppingDetailRepository shoppingDetailRepository;

    public ShoppingDetailService(ShoppingDetailRepository shoppingDetailRepository) {
        this.shoppingDetailRepository = shoppingDetailRepository;
    }

    @Override
    public List<ShoppingDetail> findAll() {
        return shoppingDetailRepository.findAll();
    }

    @Override
    public Optional<ShoppingDetail> findById(String id) {
        return shoppingDetailRepository.findById(id);
    }

    @Override
    public ShoppingDetail save(ShoppingDetail shoppingDetail) {
        return shoppingDetailRepository.save(shoppingDetail);
    }

    @Override
    public ShoppingDetail update(ShoppingDetail shoppingDetail) {
        return shoppingDetailRepository.save(shoppingDetail);
    }

    @Override
    public void delete(String id) {
        shoppingDetailRepository.deleteById(id);
    }

}
