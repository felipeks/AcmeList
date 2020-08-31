package com.acmalist.acma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acmalist.acma.models.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Short> {
	Schedule findById(short Id);
}
