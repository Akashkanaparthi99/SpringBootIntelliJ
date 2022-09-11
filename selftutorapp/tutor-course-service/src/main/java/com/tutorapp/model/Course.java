package com.tutorapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
    @Id
    @GeneratedValue(generator = "course_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "course_gen",sequenceName = "course_sequence",initialValue =1,allocationSize = 5)
    private Integer courseId;
    private String courseName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    CourseDetails details;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "course_category",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    Set<Category> categories;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    Set<Features> features;

    public Course(String courseName, CourseDetails details, Set<Category> categories, Set<Features> features) {
        this.courseName = courseName;
        this.details = details;
        this.categories = categories;
        this.features = features;
    }
}
