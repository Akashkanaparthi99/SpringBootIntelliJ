package com.tutorapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Features {
    @Id
    @GeneratedValue(generator = "features_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "features_gen",sequenceName = "features_sequence",initialValue =50,allocationSize = 5)
    private Integer featureId;
    private String featureName;

    public Features(String featureName) {
        this.featureName = featureName;
    }
}
