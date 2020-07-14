package com.example.product;

import java.io.Serializable;

public class ProductTranslationPK implements Serializable {
    private Long product;

    private Long languageId;

    public Long getProduct() {
        return product;
    }

    public Long getLanguageId() {
        return languageId;
    }
}
