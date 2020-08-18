package edu.uog.student;

import java.util.ArrayList;
import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/Student")
public class StudentController {
	private StudentRepository courserepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Student> get() {
		List<Student> courses = new ArrayList<Student>();
		courses = studentrepository.findActive();
		return student;
		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public Student getOne(@PathVariable Long id) {
			Course course = new Course();
			course = studentrepository.findOne(id);
			return student;
		}

		@RequestMapping(value = "/all", method = RequestMethod.GET)
		public List<Student> getAll() {
			List<Student> courses = new ArrayList<Student>();
			courses = studentrepository.findAll();
			return student;
		}
		
		@RequestMapping(method = RequestMethod.POST)
		public Student insert(@RequestBody Student student) {
			student.setISACTIVE("Y");
			student = studentrepository.saveAndFlush(student);
			return student;
		}

		@RequestMapping(method = RequestMethod.PUT)
		public Student update(@RequestBody Student student) {
			student = courserepository.saveAndFlush(student);
			return student;
		}
		
		@RequestMapping(method = RequestMethod.DELETE)
		public Student delete(@RequestBody Student student) {
			studentrepository.delete(student);
			return student;
		}
		
		
}
