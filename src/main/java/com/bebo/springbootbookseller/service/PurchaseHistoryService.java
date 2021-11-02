package com.bebo.springbootbookseller.service;

import com.bebo.springbootbookseller.model.PurchaseHistory;
import com.bebo.springbootbookseller.model.User;
import com.bebo.springbootbookseller.repository.IPurchaseHistoryRepository;
import com.bebo.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryService implements IPurchaseHistoryService {
    @Autowired
    private IPurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }


    @Override
    public List<IPurchaseItem> findPurchasedItem(Long userId) {
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}
