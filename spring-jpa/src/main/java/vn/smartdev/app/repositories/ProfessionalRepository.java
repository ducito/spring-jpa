package vn.smartdev.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.smartdev.app.entities.Professional;

public interface ProfessionalRepository extends
		JpaRepository<Professional, Integer> {

}