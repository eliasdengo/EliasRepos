package SpringBootCrud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SpringBootCrud.bean.Subject;
import SpringBootCrud.service.SubjectService;

@RestController
public class SubjectController {

	public SubjectService SubjectService;
	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects(){
		return SubjectService.getAllSubjects() ;
		}
	
	@RequestMapping(method=RequestMethod.POST,value="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		SubjectService.addSubject(subject);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/subjects/{id}")
	public void updateSubject(@PathVariable String id,@RequestBody Subject subject) {
		SubjectService.updateSubject(id,subject);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/subjects/{id}")
	public void deleteSubject(@PathVariable String id) {
		SubjectService.deleteSubject(id);
	}
}
