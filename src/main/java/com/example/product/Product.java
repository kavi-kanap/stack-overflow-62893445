package com.example.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Product {

    public Product() {
    }

    public Product(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    @Id
    private Long id;

    private String value;

    @OneToMany(mappedBy = "product", cascade = ALL, orphanRemoval = true)
    private List<ProductTranslation> productTranslations;

    public List<ProductTranslation> getProductTranslations() {
        return productTranslations;
    }

    public void setProductTranslations(List<ProductTranslation> productTranslations) {
        this.productTranslations = productTranslations;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }
}
