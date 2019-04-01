package com.codeClan.example.pirateService.Repositories;

import com.codeClan.example.pirateService.Models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {
}
