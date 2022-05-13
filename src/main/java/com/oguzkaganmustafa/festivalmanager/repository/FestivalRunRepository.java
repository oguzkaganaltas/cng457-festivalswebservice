package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * FestivalRunRepository to manage database communication.
 */
public interface FestivalRunRepository extends JpaRepository<FestivalRun, Integer> {



    /**
     * It takes a festivalId and return all festivalRuns belongs to that festival.
     * @param festId
     * @return
     */
    List<FestivalRun> findByFestival_FestivalId(int festId);

    /**
     * It takes a threshold value and return all festivalRuns which have less duration time than that value.
     * @param threshold
     * @return
     */
    List<FestivalRun> findByDurationLessThan(int threshold);
}
