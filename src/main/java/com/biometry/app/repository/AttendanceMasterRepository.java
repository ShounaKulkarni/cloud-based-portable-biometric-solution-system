package com.biometry.app.repository;

import com.biometry.app.entity.AttendanceMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceMasterRepository extends JpaRepository<AttendanceMaster,Integer> {
}
