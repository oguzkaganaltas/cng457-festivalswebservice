package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ShowsRepository to manage database communication.
 */
public interface ShowsRepository extends JpaRepository<Shows, Integer> {

    List<Shows> findByDurationBetween(int duration1, int duration2);
}
