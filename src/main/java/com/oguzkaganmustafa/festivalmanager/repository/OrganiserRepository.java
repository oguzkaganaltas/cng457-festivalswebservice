package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * OrganiserRepository to manage database communication.
 */
public interface OrganiserRepository extends JpaRepository<Organiser, String> {
    @Query(value = "SELECT o.* from organiser o JOIN " +
            "(SELECT email, count(fest_run_id) num_runs from festival_organisers group by email HAVING num_runs > 1) " +
            "as q1 on q1.email = o.email",nativeQuery = true)
    List<Organiser> getOrganiserWithMultipleRunsNative();

    //@Query("SELECT o from Organiser o JOIN " +
     //       "(SELECT fo.email, count(fo.fest_run_id) num_runs from festival_organisers fo group by fo.email HAVING num_runs > 1)" +
       //     "as q1 on q1.email = o.email")
    //List<Organiser> getOrganiserWithMultipleRuns();

}
