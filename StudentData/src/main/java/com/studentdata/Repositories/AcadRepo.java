package com.studentdata.Repositories;

import com.studentdata.entities.Acads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcadRepo extends JpaRepository<Acads, Integer> {
}
