package ru.itis.vagaviev.semester.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.vagaviev.semester.model.Report;

public interface ReportRepository extends JpaRepository<Report, Integer> {
}
