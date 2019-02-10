package br.com.amarotech.framework.domain.repositories.impl;

import br.com.amarotech.framework.commons.utils.AmaroTechList;
import br.com.amarotech.framework.domain.models.AmaroTechBaseModel;
import br.com.amarotech.framework.domain.repositories.AmaroTechBaseRepository;

public class AmaroTechBaseRepositoryImpl<T extends AmaroTechBaseModel> implements AmaroTechBaseRepository<T> {
	private static final long serialVersionUID = 8354817181120173885L;
	
	public AmaroTechBaseRepositoryImpl() {
		super();
	}

	@Override
	public void create(T model) {
		
	}

	@Override
	public void update(T model) {
		
	}

	@Override
	public void remove(T model) {
		
	}

	@Override
	public void remove(Long id) {
		
	}

	@Override
	public AmaroTechList<T> findAll() {
		return null;
	}

	@Override
	public T findById(Long id) {
		return null;
	}
}