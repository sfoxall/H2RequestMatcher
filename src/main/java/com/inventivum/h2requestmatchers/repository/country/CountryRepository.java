package com.inventivum.h2requestmatchers.repository.country;

import com.inventivum.h2requestmatchers.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CountryRepository extends JpaRepository<Country, UUID> {

}
