/*package com.vinyl;

import com.vinyl.model.Cart;
import com.vinyl.model.User;
import com.vinyl.repository.CartRepository;
import com.vinyl.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataLoader {

    private final UserRepository userRepository;
    private final CartRepository cartRepository;

    public DataLoader(UserRepository userRepository, CartRepository cartRepository) {
        this.userRepository = userRepository;
        this.cartRepository = cartRepository;
    }


    @PostConstruct
    public void setup() {
        User user = new User();
        userRepository.save(user);
        Cart cart = new Cart();
        cartRepository.save(cart);
    }
}*/
