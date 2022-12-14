package hellojpa._03_relation_mapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "team_id")
    private Long id;

    private String name;

    // 양방향 매핑 Team -> Member
    // @OneToMany: 하나의 Team에 여러 Member
    // mappedBy: Member클래스의 필드 'team' 과 매핑되어있다.
    // 주인은 Member클래스의 'team'
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }
}
