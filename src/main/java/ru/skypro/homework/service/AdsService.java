package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.model.Ads;
import ru.skypro.homework.model.User;

@Service
public interface AdsService {
    Ads createAds ( Ads ads);

    Ads readAds ( Long pk );

    Ads updateAds ( Ads ads );

    void deleteAds ( Long pk );
}
