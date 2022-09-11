package com.tutorapp.controller;

import com.tutorapp.model.Course;
import com.tutorapp.service.ICourseService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course-api")
public class CourseController {
    private ICourseService courseService;
    @Autowired
    public void setCourseService(ICourseService courseService) {
        this.courseService = courseService;
    }
    /*
    * @author - Akash
    * @params - Course class
    * @return -
    *           response entity of the added course object
    * */
    @PostMapping("/courses")
    public ResponseEntity<Course> addCourse(@RequestBody Course course){
        Course ncourse = courseService.addCourse(course);
        return ResponseEntity.ok().body(ncourse);
    }
    /*
     * @author - Akash
     * @params - Course class
     * @return -
     *           response entity of the updated course object
     * */
    @PutMapping("/courses")
    public ResponseEntity<String> updateCourse(Course course){
        courseService.updateCourse(course);
        return ResponseEntity.ok().build();
    }
    /*
     * @author - Akash
     * @params - courseId
     * @return -
     *           response entity message "Deleted" which has the id given
     * */
    @DeleteMapping("/courses/id/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable("id")int courseId){
        courseService.deleteCourse(courseId);
        return ResponseEntity.ok("Deleted");
    }
    /*
     * @author - Akash
     * @params - courseId
     * @return -
     *           response entity of the course object which has the id given
     * */
    @GetMapping("/courses/course-id/{id}")
    public ResponseEntity<Course> getById(@PathVariable("id")int courseId){
        Course course = courseService.getById(courseId);
        return ResponseEntity.ok(course);
    }
    /*
     * @author - Akash
     * @params - language
     * @return -
     *           response entity of the list of courses in th language given below
     * */
    @GetMapping("/courses/language/{lang}")
    public ResponseEntity<List<Course>> getByLanguage(@PathVariable("lang")String language){
        List<Course> courseList = courseService.getByLanguage(language);
        return ResponseEntity.ok(courseList);
    }
    /*
     * @author - Akash
     * @params - language
     * @params - rating
     * @return -
     *           response entity of the list of courses in th language and with rating less than the mentioned one
     * */
    @GetMapping("/courses/language/{lang}/rating/{rating}")
    public ResponseEntity<List<Course>> getByLanguageRating(@PathVariable("lang")String language,@PathVariable("rating") double rating){
        List<Course> courseList = courseService.getByLanguageRatings(language,rating);
        return ResponseEntity.ok(courseList);
    }
    /*
     * @author - Akash
     * @params - category
     * @return -
     *           response entity of the list of courses in the given category
     * */
    @GetMapping("/courses/category/{cat}")
    public ResponseEntity<List<Course>> getByCategory(@PathVariable("cat")String category){
       List<Course> course = courseService.getByCategory(category);
        return ResponseEntity.ok(course);
    }
    /*
     * @author - Akash
     * @params - feature name
     * @return -
     *           response entity of the list of courses in the with the given feature name
     * */
    @GetMapping("/courses/feature-name/{fname}")
    public ResponseEntity<List<Course>> getByFeatureName(@PathVariable("fname")String featureName){
        List<Course> courseList = courseService.getByFeatureName(featureName);
        return ResponseEntity.ok(courseList);
    }
    /*
     * @author - Akash
     * @params - course name
     * @return -
     *           response entity of the course having course name
     * */
    @GetMapping("/courses/course-name/{coursename}")
    public ResponseEntity<Course> getByCourseName(@PathVariable("coursename")String courseName){
        Course course = courseService.getByCourseName(courseName);
        return ResponseEntity.ok(course);
    }

}
