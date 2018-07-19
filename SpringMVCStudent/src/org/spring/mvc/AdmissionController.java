package org.spring.mvc;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admission")
public class AdmissionController {

	private String college = "Gokhale College";
	private String branch = "Computer Science";

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		//binder.setDisallowedFields(new String[] { "studentMobile" });
		//SimpleDateFormat format = new SimpleDateFormat("yyyy***mm***dd");
	   // binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(format, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView admissionForm() {
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}

	@ModelAttribute
	public void commonAttributes(Model model, @PathVariable Map<String, String> map) {

		if (map.get("college") != null && map.get("branch") != null) {
			college = map.get("college");
			branch = map.get("branch");
		}

		model.addAttribute("heading", "Admission Form for College " + college + "  branch : " + branch);
		model.addAttribute("footer", "Nitin Muley  Pune");
	}

	@RequestMapping(value = "/admissionSuccess.html", method = RequestMethod.POST)
	public ModelAndView admissionSuccess( @Valid @ModelAttribute("details") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("AdmissionForm");
		}
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		return modelAndView;
	}

}
