package com.biometry.app.repository;

import com.biometry.app.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivRepository extends JpaRepository<Division,Integer> {
}
