package com.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profile.model.WorkExperience;

public interface WorkExperienceRepository extends JpaRepository<WorkExperience, Long> {

}
