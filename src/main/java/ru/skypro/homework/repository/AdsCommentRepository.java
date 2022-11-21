package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework.model.AdsComment;

public interface AdsCommentRepository extends JpaRepository<AdsComment,Long> {
}
