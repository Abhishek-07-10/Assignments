package com.geekster.chatApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geekster.chatApplication.model.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
