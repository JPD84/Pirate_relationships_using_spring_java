package com.codeClan.example.pirateService.Repositories;

import com.codeClan.example.pirateService.Models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaidRepository extends JpaRepository <Raid, Long> {
}
