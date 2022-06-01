package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ConcertRepository to manage database communication.
 */
public interface ConcertRepository extends JpaRepository<Concert, Integer> {
    List<Concert> findByDescriptionContains(String str);
}
