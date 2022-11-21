package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.model.AdsComment;

@Service
public interface AdsCommentService {

    AdsComment createAdsComment ( AdsComment adsComment );

    AdsComment readAdsComment ( Long pk );

    AdsComment updateAdsComment ( AdsComment adsComment );

    void deleteAdsComment ( Long pk );
}
