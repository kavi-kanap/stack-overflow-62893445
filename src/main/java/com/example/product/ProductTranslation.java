package com.example.product;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(ProductTranslationPK.class)
public class ProductTranslation implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Id
    private Long languageId;


    public ProductTranslation() {
    }

    public ProductTranslation(Product product, Long languageId) {
        this.product = product;
        this.languageId = languageId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }
}
