package message.example.userChat.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import message.example.userChat.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query(value = "Select * from users where userName=?1;", nativeQuery = true)
    List<User> findByUserName(User userName);
}
