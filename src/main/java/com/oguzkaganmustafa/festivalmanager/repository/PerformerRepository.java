package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Performer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PerformerRepository to manage database communication.
 */
public interface PerformerRepository extends JpaRepository<Performer, Integer> {
}
