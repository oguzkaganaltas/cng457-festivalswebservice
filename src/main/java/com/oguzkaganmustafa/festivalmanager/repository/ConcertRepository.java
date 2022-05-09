package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ConcertRepository to manage database communication.
 */
public interface ConcertRepository extends JpaRepository<Concert, Integer> {
}
