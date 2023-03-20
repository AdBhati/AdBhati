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
// import message.example.userChat.dto.ChatUserDto;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue
    private UUID Id;

    private UUID msg_Id;

    private User sender;

    private User receiver;

    private String content;

    // private ChatUserDto fromUser;

    // private ChatUserDto toUser;

    private Boolean isRead;

}
