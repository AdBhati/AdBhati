package message.example.userChat.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import message.example.userChat.model.Friend;

public interface FriendRepository extends JpaRepository<Friend, UUID> {
    // Test
    @Query(value = "Select * from friend where user_id = ?1 AND id=?2", nativeQuery = true)
    Friend findByUserIdAndFriend(UUID userId, UUID friendId);

}
