package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivalRunRepository extends JpaRepository<FestivalRun, Integer> {
    List<FestivalRun> findByFestival_FestivalId(int festId);
    List<FestivalRun> findByDurationLessThan(int threshold);
}
