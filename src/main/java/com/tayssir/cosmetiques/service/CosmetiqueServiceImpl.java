package com.tayssir.cosmetiques.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.tayssir.cosmetiques.entities.Cosmetique;
import com.tayssir.cosmetiques.repos.CosmetiqueRepository;

@Service
public class CosmetiqueServiceImpl implements CosmetiqueService {

	@Autowired
	CosmetiqueRepository cosmetiqueRepository;

	@Override
	public Cosmetique saveCosmetique(Cosmetique c) {

		return cosmetiqueRepository.save(c);
	}

	@Override
	public Cosmetique updateCosmetique(Cosmetique c) {
		return cosmetiqueRepository.save(c);
	}

	@Override
	public void deleteCosmetique(Cosmetique c) {
		cosmetiqueRepository.delete(c);

	}

	@Override
	public void deleteCosmetiqueById(Long id) {
		cosmetiqueRepository.deleteById(id);

	}

	@Override
	public Cosmetique getCosmetique(Long id) {
		return cosmetiqueRepository.findById(id).get();

	}

	@Override
	public List<Cosmetique> getAllCosmetiques() {
		return cosmetiqueRepository.findAll();
	}

	@Override
	public Page<Cosmetique> getAllCosmetiquesParPage(int page, int size) {
		
		return cosmetiqueRepository.findAll(PageRequest.of(page, size));
	}

}
