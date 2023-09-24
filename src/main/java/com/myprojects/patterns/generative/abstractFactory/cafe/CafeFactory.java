package com.myprojects.patterns.generative.abstractFactory.cafe;

import com.myprojects.patterns.generative.abstractFactory.enums.TypeProduct;

public interface CafeFactory<T> {
     T create(TypeProduct typeProduct);
}
