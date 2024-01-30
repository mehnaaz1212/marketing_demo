package com.marketing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.marketing.dto.LeadDto;
import com.marketing.entity.Lead;
import com.marketing.repository.LeadRepo;

@Service
public class LeadServiceImpl implements LeadService {
  @Autowired
  private LeadRepo leadrepo;
  
  @Override
	public void saveLead(@ModelAttribute Lead lead) {
          leadrepo.save(lead);
	}
	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads=leadrepo.findAll();
		return leads;
	}
	@Override
	public void deleteLead(long id) {
       leadrepo.deleteById(id);		
	}
	@Override
	public Lead findLead(long id) {
        Lead lead=leadrepo.findById(id).get();
        return lead;
	}
	@Override
	public void updateLead(LeadDto leaddto) {
		Lead lead= new Lead();
		lead.setId(leaddto.getId());
		lead.setFirstname(leaddto.getFirstname());
		lead.setLastname(leaddto.getLastname());
		lead.setEmail(leaddto.getEmail());
		lead.setMobile(leaddto.getMobile());
        leadrepo.save(lead);
	}

}
