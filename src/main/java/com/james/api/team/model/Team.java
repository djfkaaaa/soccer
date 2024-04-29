package com.james.api.team.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.log4j.Log4j2;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@ToString(exclude = {"id"})
@Builder
@Entity(name = "teams")
@Log4j2
public class Team {
    @Id
    @Column(name = "team_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "region_name")
    private String regionName;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "e_team_name")
    private String eTeamName;
    @Column(name = "origin_year")
    private String originYear;
    @Column(name = "stadium_id")
    private Long stadiumId;
    @Column(name = "zip_code1")
    private String zipCode1;
    @Column(name = "zip_code2")
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homepage;
    private String owner;

}
