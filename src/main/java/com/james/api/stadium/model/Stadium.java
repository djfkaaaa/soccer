package com.james.api.stadium.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "stadium")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Stadium {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long stadium_id;
   private String  stadium_name;
   private Long hometeam_id;
   private String seat_count;
   private String address;
   private String ddd;
   private String tel;
}
