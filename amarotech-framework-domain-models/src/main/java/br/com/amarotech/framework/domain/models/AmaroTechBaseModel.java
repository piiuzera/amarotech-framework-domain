package br.com.amarotech.framework.domain.models;

import java.io.Serializable;
import java.util.Date;

public interface AmaroTechBaseModel extends Serializable {
	public Long getId();
	public void setId(Long id);

	public Date getCreatedAt();
	public void setCreatedAt(Date createdAt);

	public Date getUpdatedAt();
	public void setUpdatedAt(Date updatedAt);

	public Date getDeletedAt();
	public void setDeletedAt(Date deletedAt);

	public String getCode();
	public void setCode(String code);
}