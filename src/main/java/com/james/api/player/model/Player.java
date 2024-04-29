package com.james.api.player.model;
import com.james.api.common.BaseEntitiy;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@ToString(exclude = {"id"})
@Entity(name="players")

public class Player extends BaseEntitiy {

    @Id
    @Column(name = "player_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "player_name")
    private String playerName;

    @Column(name = "e_player_name")
    private String ePlayerName;

    @Column(name = "nike_name")
    private String nikeName;

    @Column(name = "join_yyyy")
    private String joinYyyy;

    private String position;

    @Column(name = "back_no")
    private String backNo;

    private String nation;

    @Column(name = "birth_date")
    private String birthDate;

    private String solar;

    private String height;

    private String weight;

}



