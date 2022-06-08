package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ConcertRepository to manage database communication.
 */
public interface ConcertRepository extends JpaRepository<Concert, Integer> {
    /**
     * Get a list of concerts whose short description contains a given keyword
     * @param str String
     * @return List
     */
    List<Concert> findByDescriptionContains(String str);
}
