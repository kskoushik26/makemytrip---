package com.makemytrip.server.flightdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.makemytrip.server.model.FlightData;

public interface FlightRepository extends MongoRepository<FlightData, Long> {

	boolean existsByDestination(String destination);

	boolean existsBySource(String source);

}
