package com.codeClan.example.pirateService.Repositories;

import com.codeClan.example.pirateService.Models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository extends JpaRepository<Ship, Long> {
}
