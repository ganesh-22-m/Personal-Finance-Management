package com.Ganesh.plutocracy.service;

import org.springframework.stereotype.Service;

import com. Ganesh.plutocracy.repository.TotalBalanceRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TotalBalanceService {

	private final TotalBalanceRepository totalBalanceRepository;

}
