package com.rocketseat.planner.link;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, UUID>{
    public List<Link> findByTripId(UUID tripId);
}
