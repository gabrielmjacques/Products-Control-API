package com.api.productscontrol.repositories;

import com.api.productscontrol.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
// Apesar de ser uma bom deixar explicito, não seria necessário incluir esse esteriótipo, visto que a interface já extende do JpaRepository
// Então o Spring automaticamente reconhece como um bean repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
