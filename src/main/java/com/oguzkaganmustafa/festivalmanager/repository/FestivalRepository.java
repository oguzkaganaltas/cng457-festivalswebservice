package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * FestivalRepository to manage database communication.
 */
public interface FestivalRepository extends JpaRepository<Festival, Integer> {
    /**
     * It takes a string parameter and search it in place column to return all festival happening it that city.
     * @param city
     * @return
     */
    List<Festival> findByPlace(String city);
}
