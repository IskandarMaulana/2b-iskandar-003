package com.astratech._2biskandar112.repositories;

import com.astratech._2biskandar112.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, Long> {
}
