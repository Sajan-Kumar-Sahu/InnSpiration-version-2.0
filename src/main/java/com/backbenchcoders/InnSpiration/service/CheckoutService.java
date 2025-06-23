package com.backbenchcoders.InnSpiration.service;

import com.backbenchcoders.InnSpiration.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
