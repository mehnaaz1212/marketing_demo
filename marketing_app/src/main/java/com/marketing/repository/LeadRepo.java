package com.marketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing.entity.Lead;

public interface LeadRepo extends JpaRepository<Lead, Long> {

}
