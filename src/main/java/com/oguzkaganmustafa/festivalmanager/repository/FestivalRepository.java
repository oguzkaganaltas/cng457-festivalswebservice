package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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


    @Query("SELECT f FROM Festival f WHERE f.festivalName LIKE %?1%")
    List<Festival> findFestivalsByName(String name);

    @Query(value = "SELECT * FROM festival WHERE festivalName = ?1",nativeQuery = true)
    List<Festival> findFestivalsByNameNative(String name);

}
