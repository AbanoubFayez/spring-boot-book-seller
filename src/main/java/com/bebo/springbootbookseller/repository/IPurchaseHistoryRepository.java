package com.bebo.springbootbookseller.repository;

import com.bebo.springbootbookseller.model.PurchaseHistory;
import com.bebo.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long> {
    @Query("SELECT b.title, ph.price, ph.purchaseTime " +
            "FROM PurchaseHistory ph left join Book b" +
            " ON b.id = ph.bookId WHERE ph.userId = :user_id")
    List<IPurchaseItem> findAllPurchasesOfUser(@Param("user_id") Long UserId);

}
