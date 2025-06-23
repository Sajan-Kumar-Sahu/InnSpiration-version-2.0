package com.backbenchcoders.InnSpiration.strategy;

import com.backbenchcoders.InnSpiration.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
