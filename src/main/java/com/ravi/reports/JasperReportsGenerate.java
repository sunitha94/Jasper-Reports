package com.ravi.reports;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ravi.dto.SalesDAO;

import net.sf.jasperreports.engine.JRDataSource;

@RestController
@RequestMapping("/main")
public class JasperReportsGenerate {
	
	
	
	@RequestMapping(value = "/download", method = RequestMethod.GET)
    public ModelAndView doSalesMultiReport(@RequestParam("type") String type,ModelAndView modelAndView, ModelMap model) {
		
		SalesDAO dataprovider = new SalesDAO(); 
		  JRDataSource datasource  = dataprovider.getDataSource();  
		  model.addAttribute("datasource", datasource);
		  model.addAttribute("format", type); 
		  modelAndView = new ModelAndView("sample_report", model);   
		  return modelAndView;  
	}

}
