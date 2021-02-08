package com.biometry.app.repository;

import com.biometry.app.entity.StudentMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMasterRepository extends JpaRepository<StudentMaster,Integer> {
}
