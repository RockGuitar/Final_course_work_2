package ru.skypro.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.AdsDto;
import ru.skypro.homework.mappings.AdsMapper;
import ru.skypro.homework.model.Ads;
import ru.skypro.homework.service.AdsService;

@RestController
@RequestMapping("/ads")
@CrossOrigin(value = "http://localhost:3000")
public class AdsController {

    private final AdsService adsService;

    @Autowired
    public AdsController ( AdsService adsService) {
        this.adsService = adsService;
    }

//    @Secured("USER")
//    @PatchMapping("/me")
//    public AdsDto updateAds( @RequestBody AdsDto adsDto){
//        Ads updatedAds = adsMapper.adsDtoToAds(adsDto);
//        adsService.updateAds(updatedAds);
//        return adsDto;
//    }
//    @Secured("USER")
//    @GetMapping("/me")
//    public AdsDto readAds(Long id){
//        Ads foundAds = adsService.readAds(id);
//        return adsMapper.adsToAdsDto(foundAds);
//    }
//    @Secured("USER")
//    @DeleteMapping
//    public void deleteAds(Long id){
//        Ads foundAds = adsService.readAds(id);
//        AdsDto foundAdsDto = adsMapper.adsToAdsDto(foundAds);
//        adsService.deleteAds(foundAdsDto.getId());
//    }
}
