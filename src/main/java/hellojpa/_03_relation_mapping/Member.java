package hellojpa._03_relation_mapping;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username")
    private String username;

//    @Column(name = "team_id")
//    private Long teamId;

    // Member -> Team 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="team_id") // member 테이블의 FK 'team_id' 와 매핑
    private Team team;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
