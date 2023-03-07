package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends JpaRepository<Weather, String> {

    Optional<Weather> findByCity(String city);
}