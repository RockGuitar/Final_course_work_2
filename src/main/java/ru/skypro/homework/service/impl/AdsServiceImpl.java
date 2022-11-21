package ru.skypro.homework.service.impl;

import ru.skypro.homework.model.Ads;
import ru.skypro.homework.model.User;
import ru.skypro.homework.repository.AdsRepository;
import ru.skypro.homework.service.AdsService;

public class AdsServiceImpl implements AdsService {

    private AdsRepository adsRepository;

    public AdsServiceImpl ( AdsRepository adsRepository ) {
        this.adsRepository = adsRepository;
    }

    public Ads createAds ( Ads ads ) {
        return adsRepository.save(ads);
    }

    public Ads readAds ( Long pk ) {
        return adsRepository.findById(pk).orElseThrow();
    }

    public Ads updateAds ( Ads ads ) {
        return adsRepository.save(ads);
    }

    public void deleteAds ( Long pk ) {
        adsRepository.deleteById(pk);
    }
}
