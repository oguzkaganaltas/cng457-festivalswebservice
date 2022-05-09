package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.OtherActivities;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * OtherActivitiesRepository to manage database communication.
 */
public interface OtherActivitiesRepository extends JpaRepository<OtherActivities, Integer> {
}
