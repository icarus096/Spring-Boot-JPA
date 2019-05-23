package com.example.springbootjpa.repository;

import com.example.springbootjpa.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal,Long> { }