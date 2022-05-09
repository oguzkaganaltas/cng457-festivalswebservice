package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * OrganiserRepository to manage database communication.
 */
public interface OrganiserRepository extends JpaRepository<Organiser, String> {


}
