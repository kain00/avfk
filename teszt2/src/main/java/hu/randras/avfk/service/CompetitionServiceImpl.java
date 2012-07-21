package hu.randras.avfk.service;

import hu.randras.avfk.model.Competition;
import hu.randras.avfk.service.repository.CompetitionRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompetitionServiceImpl implements CompetitionService {

	@Autowired
	private CompetitionRepository competitionRepository;

	@Override
	public Competition save(Competition competition) {
		return competitionRepository.save(competition);
	}

	@Override
	public void delete(Competition competition) {
		competitionRepository.delete(competition);
	}

	@Override
	public List<Competition> findAll() {
		return competitionRepository.findAll();
	}

	@Override
	public Competition findOne(Long id) {
		return competitionRepository.findOne(id);
	}

	@Override
	public List<Competition> findByTextId(String textId) {
		return competitionRepository.findByTextId(textId);
	}

	@Override
	public List<Competition> findByDescriptionLike(String descriptionPart) {
		return competitionRepository.findByDescriptionLike(descriptionPart);
	}

	@Override
	public Iterable<Competition> save(Iterable<? extends Competition> entities) {
		return competitionRepository.save(entities);
	}

	@Override
	public boolean exists(Long id) {
		return competitionRepository.exists(id);
	}

	@Override
	public long count() {
		return competitionRepository.count();
	}

	@Override
	public void delete(Long id) {
		competitionRepository.delete(id);
	}

	@Override
	public void delete(Iterable<? extends Competition> entities) {
		competitionRepository.delete(entities);
	}

	@Override
	public void deleteAll() {
		competitionRepository.deleteAll();
	}
}
