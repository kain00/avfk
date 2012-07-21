package hu.randras.avfk.service.repository;

import java.util.List;

import hu.randras.avfk.model.Competition;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CompetitionRepository extends CrudRepository<Competition, Long> {
	
	List<Competition> findAll();
	
	@Query("from Competition c where c.textId = ?")
	List<Competition> findByTextId(String textId);
	
	@Query("from Competition c where c.description LIKE ?")
	List<Competition> findByDescriptionLike(String descriptionPart);
	
}
