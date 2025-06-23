package com.backbenchcoders.InnSpiration.repository;

import com.backbenchcoders.InnSpiration.entity.Guest;
import com.backbenchcoders.InnSpiration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}