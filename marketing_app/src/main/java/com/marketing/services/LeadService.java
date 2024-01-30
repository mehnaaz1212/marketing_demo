package com.marketing.services;

import java.util.List;

import com.marketing.dto.LeadDto;
import com.marketing.entity.Lead;

public interface LeadService {
   public List<Lead> getAllLeads();

   public void saveLead(Lead lead);

   public void deleteLead(long id);

   public Lead findLead(long id);
   
	public void updateLead(LeadDto leaddto);
}
