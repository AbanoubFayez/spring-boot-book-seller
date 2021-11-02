package com.bebo.springbootbookseller.service;

import com.bebo.springbootbookseller.model.PurchaseHistory;
import com.bebo.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItem(Long id);
}
