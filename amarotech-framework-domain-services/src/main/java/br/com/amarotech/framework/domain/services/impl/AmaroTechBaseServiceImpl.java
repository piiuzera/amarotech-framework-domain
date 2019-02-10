package br.com.amarotech.framework.domain.services.impl;

import br.com.amarotech.framework.commons.utils.AmaroTechList;
import br.com.amarotech.framework.domain.models.AmaroTechBaseModel;
import br.com.amarotech.framework.domain.repositories.AmaroTechBaseRepository;
import br.com.amarotech.framework.domain.services.AmaroTechBaseService;

public class AmaroTechBaseServiceImpl<T extends AmaroTechBaseModel> implements AmaroTechBaseService<T> {
	private static final long serialVersionUID = -6532826711418891420L;
	
	private AmaroTechBaseRepository<T> repository;
	
	public AmaroTechBaseServiceImpl(AmaroTechBaseRepository<T> repository) {
		this.repository = repository;
	}
	
	protected AmaroTechBaseRepository<T> getRepository() {
		return repository;
	}

	@Override
	public void create(T model) {
		repository.create(model);
	}

	@Override
	public void update(T model) {
		repository.update(model);
	}

	@Override
	public void remove(Long id) {
		repository.remove(id);
	}

	@Override
	public AmaroTechList<T> findAll() {
		return repository.findAll();
	}

	@Override
	public T findById(Long id) {
		return repository.findById(id);
	}
}