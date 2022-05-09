package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ShowsRepository to manage database communication.
 */
public interface ShowsRepository extends JpaRepository<Shows, Integer> {
}
