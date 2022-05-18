package ru.itis.vagaviev.semester.service;

import ru.itis.vagaviev.semester.dto.CreateReportDto;
import ru.itis.vagaviev.semester.dto.ReportDto;

public interface ReportService {
    ReportDto save(CreateReportDto report);
}
