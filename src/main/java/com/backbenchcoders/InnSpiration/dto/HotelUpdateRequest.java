package com.backbenchcoders.InnSpiration.dto;

import com.backbenchcoders.InnSpiration.entity.HotelContactInfo;
import lombok.Data;

import java.util.List;

@Data
public class HotelUpdateRequest {
    private String name;
    private String city;
    private List<String> photos;
    private List<String> amenities;
    private HotelContactInfo contactInfo;
}
