package com.acmalist.acma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acmalist.acma.models.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Short> {
	
}
