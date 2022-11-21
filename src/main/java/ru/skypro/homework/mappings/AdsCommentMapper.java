package ru.skypro.homework.mappings;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.skypro.homework.dto.AdsCommentDto;
import ru.skypro.homework.model.AdsComment;

@Mapper
public interface AdsCommentMapper {
    AdsCommentMapper INSTANCE = Mappers.getMapper(AdsCommentMapper.class);

    AdsCommentDto adsCommentToAdsCommentDto ( AdsComment adsComment );

    AdsComment adsCommentDtoToAdsComment ( AdsCommentDto adsCommentDto );
}
