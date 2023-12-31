package com.gui.flowershop.repositories;

import com.gui.flowershop.entities.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Page<Review> findByProductId(@RequestParam("product_Id") Long productId, Pageable pageable);

}
