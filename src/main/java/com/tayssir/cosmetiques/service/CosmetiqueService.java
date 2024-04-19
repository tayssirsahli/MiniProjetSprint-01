package com.tayssir.cosmetiques.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.tayssir.cosmetiques.entities.Cosmetique;

public interface CosmetiqueService {

	Cosmetique saveCosmetique(Cosmetique c);

	Cosmetique updateCosmetique(Cosmetique c);

	void deleteCosmetique(Cosmetique c);

	void deleteCosmetiqueById(Long id);

	Cosmetique getCosmetique(Long id);

	List<Cosmetique> getAllCosmetiques();
	
	Page<Cosmetique> getAllCosmetiquesParPage(int page, int size);

}
