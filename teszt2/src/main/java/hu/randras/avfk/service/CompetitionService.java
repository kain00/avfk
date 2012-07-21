package hu.randras.avfk.service;

import hu.randras.avfk.model.Competition;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CompetitionService extends CrudRepository<Competition, Long> {

	Competition save(Competition competition);
	
	void delete(Competition competition);
	
	List<Competition> findAll();
	
	Competition findOne(Long id);
	
	List<Competition> findByTextId(String textId);
	
	List<Competition> findByDescriptionLike(String descriptionPart);
	
}
