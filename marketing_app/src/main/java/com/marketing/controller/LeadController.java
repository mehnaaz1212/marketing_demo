package com.marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.dto.LeadDto;
import com.marketing.entity.Lead;
import com.marketing.services.LeadService;

@Controller
public class LeadController {
	@Autowired
	LeadService leadservice;
	//http//localhost:8080/view
	@RequestMapping("/view")
	public String viewController() {
		return "create_lead";
	}
	@RequestMapping("/savelead")
    public String saveLead(Lead lead, Model map) {
		leadservice.saveLead(lead);
		map.addAttribute("msg", "Record saved successfully!!");
		return "create_lead";
	}
	
	//another way of reading data
//	@RequestMapping("/savelead")
//    public String saveLead(@RequestParam("firstname")String firstname,@RequestParam("lastname")String lastname,
//    		@RequestParam("email")String email,@RequestParam("mobile")long mobile,Model map) {
//		Lead lead= new Lead();
//        lead.setFirstname(firstname);
//        lead.setLastname(lastname);
//        lead.setEmail(email);
//        lead.setMobile(mobile);
//        leadservice.saveLead(lead);
//		map.addAttribute("msg", "saved!!");
//		return "create_lead";
//	}
//	@RequestMapping("/savelead")
//  public String saveLead(LeadDto leaddto, Model map) {
//	    Lead lead = new Lead();
//	    lead.setFirstname(leaddto.getFirstname());
//	    lead.setLastname(leaddto.getLastname());
//	    lead.setEmail(leaddto.getEmail());
//	    lead.setMobile(leaddto.getMobile());
//	    leadservice.saveLead(lead);
//	    map.addAttribute("msg", "saved!");
//		return "create_lead";
//  }
	
	@RequestMapping("/listall")
	public String getAllLeads(Model map) {
		List<Lead>leads=leadservice.getAllLeads();
		map.addAttribute("leads", leads);
		return "lead";
	}
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id")long id,Model map) {
		leadservice.deleteLead(id);
		List<Lead> leads=leadservice.getAllLeads();
		map.addAttribute("leads",leads);
		return "lead";
	}
	@RequestMapping("/update")
	public String updateLead(@RequestParam("id") long id, Model map)  {
		Lead lead= leadservice.findLead(id);
		map.addAttribute("lead",lead);
		return "update_lead";
	}
	@RequestMapping("/updatelead")
	public String updateLeadInfoemation(LeadDto leaddto, Model map){
		 leadservice.updateLead(leaddto);
		 List<Lead>leads = leadservice.getAllLeads();
		 map.addAttribute("leads", leads);
		return "lead";
	}
	
}
