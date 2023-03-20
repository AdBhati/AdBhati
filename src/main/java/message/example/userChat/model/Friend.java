package message.example.userChat.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "friends")
public class Friend {

    @Id
    @GeneratedValue
    private UUID Id;

    private Boolean isFriend;

    private Boolean isActive;

    // @OneToOne(cascade = CascadeType.MERGE)
    // @JoinColumn(name = "friend_id", referencedColumnName = "id")
    private User friend;

    // @OneToOne
    // @JoinColumn(name = "user_Id", referencedColumnName = "id")
    private User user;

}
