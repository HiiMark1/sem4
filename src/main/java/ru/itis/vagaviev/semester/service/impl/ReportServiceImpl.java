package ru.itis.vagaviev.semester.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.vagaviev.semester.dto.CreateReportDto;
import ru.itis.vagaviev.semester.dto.PostDto;
import ru.itis.vagaviev.semester.dto.ReportDto;
import ru.itis.vagaviev.semester.model.Report;
import ru.itis.vagaviev.semester.repository.PostRepository;
import ru.itis.vagaviev.semester.repository.ReportRepository;
import ru.itis.vagaviev.semester.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {
    private final ReportRepository reportRepository;

    @Autowired
    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public ReportDto save(CreateReportDto report) {
        return ReportDto.formModel(reportRepository.save(new Report(report.getUserId(), report.getDate(), report.getText())));
    }
}
