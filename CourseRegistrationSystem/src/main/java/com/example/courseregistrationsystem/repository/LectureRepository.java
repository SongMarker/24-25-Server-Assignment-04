package com.example.courseregistrationsystem.repository;

import com.example.courseregistrationsystem.domain.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
}
