package com.Ganesh.plutocracy.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ganesh.plutocracy.entity.TotalBalance;

@Repository
public interface TotalBalanceRepository extends JpaRepository<TotalBalance, UUID> {

	Optional<TotalBalance> findByUserId(UUID userId);

}
