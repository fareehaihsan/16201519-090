package edu.uog.course.controller;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	import pk.edu.uog.course.model.Course;
	import pk.edu.uog.course.repository.courseRepository;

	@RestController
	@CrossOrigin
	@RequestMapping("/course")
	

public class courseController{
		@Autowired
		private courseRepository courserepository;

		@RequestMapping(method = RequestMethod.GET)
		public List<Course> get() {
			List<Course> courses = new ArrayList<Course>();
			courses = courserepository.findActive();
			return courses;
			@RequestMapping(value = "/{id}", method = RequestMethod.GET)
			public Course getOne(@PathVariable Long id) {
				Course course = new Course();
				course = courserepository.findOne(id);
				return course;
			}

			@RequestMapping(value = "/all", method = RequestMethod.GET)
			public List<Course> getAll() {
				List<Course> courses = new ArrayList<Course>();
				courses = courserepository.findAll();
				return courses;
			}
			
			@RequestMapping(method = RequestMethod.POST)
			public Course insert(@RequestBody Course course) {
				course.setISACTIVE("Y");
				course = courserepository.saveAndFlush(course);
				return course;
			}

			@RequestMapping(method = RequestMethod.PUT)
			public Course update(@RequestBody Course course) {
				course = courserepository.saveAndFlush(course);
				return course;
			}
			
			@RequestMapping(method = RequestMethod.DELETE)
			public Course delete(@RequestBody Course course) {
				courserepository.delete(course);
				return course;
			}
			
			
			
}
