package message.example.userChat.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import message.example.userChat.model.Friend;
import message.example.userChat.model.Message;
import message.example.userChat.model.User;
import message.example.userChat.repository.FriendRepository;
import message.example.userChat.repository.UserRepository;
import message.example.userChat.service.MessageService;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final UserRepository userRepository;
    private final FriendRepository friendRepository;

    // Send Message
    @Override
    public String sendMessage(UUID friend_id, Message message, User userName) {
        // User sender = userRepository.findByUserName(userName);
        // List<User> sender = userRepository.findByUserName(userName);
        // Friend friend = friendRepository.findByUserIdAndFriend(sender.getId(),
        // friend_id);
        return null;
    }

    // Add Friend
    @Override
    public String addFriend(UUID user_Id, UUID friend_id, String userName) {

        Set<UUID> userIds = new HashSet<>();
        userIds.add(friend_id);
        userIds.add(user_Id);

        java.util.List<User> users = userRepository.findAllById(userIds);

        User user = new User();
        User friend = new User();
        if (users != null && users.size() > 0) {
            for (User u : users) {
                if (u.getId().equals(user_Id)) {
                    user = u;
                }
                if (u.getId().equals(friend_id)) {
                    friend = u;
                }
            }
            Friend newFriend = new Friend();

            newFriend.setUser(user);
            newFriend.setFriend(friend);

            friendRepository.save(newFriend);
        }
        return new String("Friend Added");
    }

    // @Override
    // public String sendMessage(UUID friend_id, Message message) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method
    // 'sendMessage'");
    // }

    // // @Override
    // // public String addFriend(UUID user_Id, UUID friend_id, User userName) {
    // // // TODO Auto-generated method stub
    // // throw new UnsupportedOperationException("Unimplemented method
    // 'addFriend'");
    // // }

}
