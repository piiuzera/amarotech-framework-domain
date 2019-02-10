package br.com.amarotech.framework.domain.services;

import java.io.Serializable;

import br.com.amarotech.framework.commons.utils.AmaroTechList;
import br.com.amarotech.framework.domain.models.AmaroTechBaseModel;

public interface AmaroTechBaseService<T extends AmaroTechBaseModel> extends Serializable {
	public void create(T model);
	public void update(T model);
	public void remove(Long id);
	public AmaroTechList<T> findAll();
	public T findById(Long id);
}