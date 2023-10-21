package com.api.productscontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

// Os Records são uma nova forma de declarar classes no Java. Eles são imutáveis por padrão, o que significa que não podemos alterar seus valores após a criação do objeto. Além disso, eles são bastante úteis para representar dados, como, por exemplo, uma entidade de banco de dados.
public record ProductRecordDto(@NotBlank String name, String description,@NotNull BigDecimal value) {

}
