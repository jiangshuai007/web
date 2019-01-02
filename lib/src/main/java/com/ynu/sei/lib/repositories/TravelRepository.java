package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel, String> {
}
