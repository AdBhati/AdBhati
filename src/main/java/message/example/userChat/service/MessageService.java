package message.example.userChat.service;

import java.util.UUID;

import message.example.userChat.model.Message;
import message.example.userChat.model.User;

public interface MessageService {

    public String sendMessage(UUID friend_id, Message message, User userName);

    public String addFriend(UUID user_Id, UUID friend_id, String userName);

}
