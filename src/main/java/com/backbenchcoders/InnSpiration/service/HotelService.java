package com.backbenchcoders.InnSpiration.service;

import com.backbenchcoders.InnSpiration.dto.HotelDto;
import com.backbenchcoders.InnSpiration.dto.HotelInfoDto;
import com.backbenchcoders.InnSpiration.dto.HotelInfoRequestDto;
import com.backbenchcoders.InnSpiration.dto.HotelUpdateRequest;

import java.util.List;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    void updateHotelById(Long id, HotelUpdateRequest request);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId, HotelInfoRequestDto hotelInfoRequestDto);

    List<HotelDto> getAllHotels();
}
