package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * OrganiserRepository to manage database communication.
 */
public interface OrganiserRepository extends JpaRepository<Organiser, String> {

    List<Organiser> findByNameContainingOrPhoneNumberEqualsOrEmailStartingWithOrSurnameContaining(String name,String phoneNumber, String email, String surname);
}
