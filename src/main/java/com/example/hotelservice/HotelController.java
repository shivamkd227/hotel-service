package com.example.hotelservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hotels")
public class HotelController {

    @GetMapping("/search")
    public String searchHotels() {
        System.out.println("=== [HOTEL SERVICE] Executing Hotel Search Logic ===");
        return "Hotel Service: Found 12 available hotels!";
    }
}