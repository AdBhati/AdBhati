package message.example.userChat.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/msg")
public class UserController {

    @PostMapping("addFriend/{userId}/{friendId}")
    public String addFriend(@PathVariable UUID userId, @PathVariable UUID friendId) {
        return new String("Success");
    }

    @PostMapping("/send{friendId}")
    public String sendMessage(@PathVariable UUID friendId) {
        return new String("Send Message");
    }

}
