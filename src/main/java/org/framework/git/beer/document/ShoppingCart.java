package org.framework.git.beer.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ShoppingCart")
public class ShoppingCart extends AbstractModel {

    private AbstractModel user;
    private List<ShoppingDetail> shoppingDetail;


}