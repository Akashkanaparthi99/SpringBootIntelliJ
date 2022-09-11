package com.tutorapp;

import com.tutorapp.service.ICategoryService;
import com.tutorapp.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class TutorCourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorCourseServiceApplication.class, args);
	}

	private ICategoryService categoryService;
	private ICourseService courseService;
	@Autowired
	public void setCategoryService(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}
	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Features features1 = new Features("Sub-Titles");
//		Features features2 = new Features("Quiz");
//		Features features3 = new Features("Assignments");
//		Set<Features> featuresSet = new HashSet<>(Arrays.asList(features1,features2,features3));
//		CourseDetails details = new CourseDetails(4.5,2000,"English",4);
//		Category category1 = new Category("App Developer");
//		Category category2 = new Category("Web Developer");
//		Category category3 = new Category("Backend Developer");
//		categoryService.addCategory(category2);
//		categoryService.addCategory(category3);
//		Category cat = categoryService.getById(201);
//		Category cat1 = categoryService.getById(251);
//		Category cat2 = categoryService.getById(252);
//
//		Set<Category> categories = new HashSet<>(Arrays.asList(cat,cat1,cat2));
//		Course course = new Course("Full Stack Developer",details,categories,featuresSet);
//		courseService.addCourse(course);
//	}
}
