package com.HelloEvents.HelloEvents.Repository;


import com.HelloEvents.HelloEvents.Dto.Result;
import com.HelloEvents.HelloEvents.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventRepository extends JpaRepository<Evenement, Long> {

    @Query(value = "select", nativeQuery = true)
    List<Result> findBy(Long id);

}
