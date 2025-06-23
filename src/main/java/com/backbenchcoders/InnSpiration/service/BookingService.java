package com.backbenchcoders.InnSpiration.service;

import com.backbenchcoders.InnSpiration.dto.BookingDto;
import com.backbenchcoders.InnSpiration.dto.BookingRequest;
import com.backbenchcoders.InnSpiration.dto.HotelReportDto;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<Long> guestIdList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingDto getBookingById(Long bookingId);

    List<BookingDto> getAllBookingsByHotelId(Long hotelId);

    HotelReportDto getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDto> getMyBookings();

    BookingDto removeGuestsFromBooking(Long bookingId, List<Long> guestIdList);
}
