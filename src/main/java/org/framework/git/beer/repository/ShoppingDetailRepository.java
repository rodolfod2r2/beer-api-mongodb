package org.framework.git.beer.repository;

import org.framework.git.beer.document.ShoppingDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingDetailRepository extends MongoRepository<ShoppingDetail, String> {
}
