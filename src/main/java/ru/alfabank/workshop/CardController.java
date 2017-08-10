package ru.alfabank.workshop;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class CardController {

//    @Autowired
    private final ApplePayClient client;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    List<String> getCards(@PathVariable String userId){

        return client.getAppleCards(userId).getCards();
    }

}
