package br.com.amarotech.framework.domain.models.impl;

import java.util.Date;

import br.com.amarotech.framework.domain.models.AmaroTechBaseModel;

public class AmaroTechBaseModelImpl implements AmaroTechBaseModel {
	private static final long serialVersionUID = 3298553440285514508L;
	
	private Long id;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private String code;
	
	public AmaroTechBaseModelImpl() {
		super();
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public Date getDeletedAt() {
		return deletedAt;
	}

	@Override
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@Override
	public String getCode() {
		return code;
	}
	
	@Override
	public void setCode(String code) {
		this.code = code;
	}
}