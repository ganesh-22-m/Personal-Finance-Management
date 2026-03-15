package com.Ganesh.plutocracy.service;

import org.springframework.stereotype.Service;

import com. Ganesh.plutocracy.repository.NoteTagMappingRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NoteTagMappingService {

	private final NoteTagMappingRepository noteTagMappingRepository;

}
