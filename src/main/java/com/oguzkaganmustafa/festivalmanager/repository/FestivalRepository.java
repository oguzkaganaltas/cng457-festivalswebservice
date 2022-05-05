package com.oguzkaganmustafa.festivalmanager.repository;

import com.oguzkaganmustafa.festivalmanager.entity.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FestivalRepository extends JpaRepository<Festival, Integer> {
}
