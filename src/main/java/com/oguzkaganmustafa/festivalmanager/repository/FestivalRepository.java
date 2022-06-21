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

    /**
     *  selects all festival where it contains a keyword. JPA query.
     * @param name String
     * @return List
     */
    @Query("SELECT f FROM Festival f WHERE f.festivalName LIKE %?1%")
    List<Festival> findFestivalsByName(String name);

    /**
     *  selects all festival where it contains a keyword. Native query.
     * @param name String
     * @return List
     */
    @Query(value = "SELECT * FROM festival WHERE festivalName = ?1",nativeQuery = true)
    List<Festival> findFestivalsByNameNative(String name);

    /**
     * Returns the most popular festivals with highest festival runs. native Query.
     * @return List
     */
    /*@Query(value = "SELECT f.* from festival f JOIN (select q1.festival_festival_id, max(q1.num_runs) from \n" +
            "(SELECT festival_festival_id, count(festival_festival_id) num_runs \n" +
            "from festival_run \n" +
            "group by festival_festival_id) as q1) as q2 on q2.festival_festival_id= f.festival_id ", nativeQuery = true)*/
    @Query(value = "select f from Festival f where SIZE(f.festivalRunList) = (select max(SIZE(f2.festivalRunList)) from Festival f2)")
    List<Festival> findMostPopularFestivals();
}
