package com.tutorapp.model;

import lombok.*;
import org.hibernate.id.IntegralDataTypeHolder;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDetails {
    @Id
    @GeneratedValue(generator = "coursedetails_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "coursedetails_gen",sequenceName = "coursedetails_sequence",initialValue =10,allocationSize = 5)
    private Integer detailsId;
    private double rating;
    private double cost;
    private String language;
    private int durationInHours;

    public CourseDetails(double rating, double cost, String language, int durationInHours) {
        this.rating = rating;
        this.cost = cost;
        this.language = language;
        this.durationInHours = durationInHours;
    }
}
