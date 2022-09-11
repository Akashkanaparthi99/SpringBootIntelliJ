package com.tutorapp.service;

import com.tutorapp.model.Course;

import java.util.List;

public interface ICourseService {

    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(int courseId);
    Course getById(int courseId);
    List<Course> getByLanguage(String language);
    List<Course> getByLanguageRatings(String language, double ratings);
    List<Course> getByCategory(String category);
    List<Course> getByFeatureName(String featuresName);
    Course getByCourseName(String courseName);


}
