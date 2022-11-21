package ru.skypro.homework.service.impl;

import ru.skypro.homework.model.Ads;
import ru.skypro.homework.model.AdsComment;
import ru.skypro.homework.repository.AdsCommentRepository;
import ru.skypro.homework.repository.AdsRepository;
import ru.skypro.homework.service.AdsCommentService;

public class AdsCommentsServiceImpl implements AdsCommentService {

    private AdsCommentRepository adsCommentRepository;

    public AdsCommentsServiceImpl ( AdsCommentRepository adsCommentRepository ) {
        this.adsCommentRepository = adsCommentRepository;
    }

    public AdsComment createAdsComment ( AdsComment adsComment ) {
        return adsCommentRepository.save(adsComment);
    }

    public AdsComment readAdsComment ( Long pk ) {
        return adsCommentRepository.findById(pk).orElseThrow();
    }

    public AdsComment updateAdsComment ( AdsComment adsComment ) {
        return adsCommentRepository.save(adsComment);
    }

    public void deleteAdsComment ( Long pk ) {
        adsCommentRepository.deleteById(pk);
    }
}
