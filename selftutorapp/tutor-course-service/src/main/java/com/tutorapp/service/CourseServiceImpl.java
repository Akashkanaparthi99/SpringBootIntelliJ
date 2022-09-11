package com.tutorapp.service;

import com.tutorapp.model.Course;
import com.tutorapp.repository.ICourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements ICourseService{

    ICourseRepository courseRepository;

    public CourseServiceImpl(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course addCourse(Course course) {
        System.out.println(course);
       return courseRepository.save(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(int courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public Course getById(int courseId) {
        return courseRepository.findById(courseId).get();
    }

    @Override
    public List<Course> getByLanguage(String language) {
        return courseRepository.getByLanguage(language);
    }

    @Override
    public List<Course> getByLanguageRatings(String language, double ratings) {
        return courseRepository.getByLanguageRatings(language, ratings);
    }

    @Override
    public List<Course> getByCategory(String category) {
        return courseRepository.getByCategory(category);
    }

    @Override
    public List<Course> getByFeatureName(String featuresName) {
        return courseRepository.getByFeatureName(featuresName);
    }

    @Override
    public Course getByCourseName(String courseName) {
        return courseRepository.findByCourseName(courseName);
    }

}
