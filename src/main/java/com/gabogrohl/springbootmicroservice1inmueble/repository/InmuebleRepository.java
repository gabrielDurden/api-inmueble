package com.gabogrohl.springbootmicroservice1inmueble.repository;

import com.gabogrohl.springbootmicroservice1inmueble.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {
}
