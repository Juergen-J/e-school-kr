package com.jj.eschool.entity;

import com.jj.eschool.entity.enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "electronic_library")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ElectronicLibrary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long resourceID;
    private  String title;
    private Type type;
    private String url;
    private String description;

}
