package com.tutorapp.repository;

import com.tutorapp.model.Course;
import com.tutorapp.model.CourseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseRepository extends JpaRepository<Course,Integer> {
 Course findByCourseName(String courseName);
 @Query("from Course c inner join c.details d where d.language like ?1")
 List<Course> getByLanguage(String language);
 @Query("from Course c inner join c.details d where d.language = ?1 and d.rating < ?2")
 List<Course> getByLanguageRatings(String language, double ratings);
 @Query("from Course c inner join c.categories n where n.categoryName = ?1")
 List<Course> getByCategory(String category);
 @Query("from Course c inner join c.features f where f.featureName = ?1")
 List<Course> getByFeatureName(String featuresName);
}
