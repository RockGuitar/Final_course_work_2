package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.skypro.homework.model.Ads;

import java.util.List;

public interface AdsRepository extends JpaRepository<Ads,Long> {

    @Query(value = "SELECT * FROM ads WHERE title LIKE %:title%", nativeQuery = true)
    List<Ads> findAdsLike ( String title );
}
