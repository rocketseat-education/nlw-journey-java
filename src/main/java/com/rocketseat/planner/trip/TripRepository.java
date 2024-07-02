package com.rocketseat.planner.trip;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, UUID>{
}
