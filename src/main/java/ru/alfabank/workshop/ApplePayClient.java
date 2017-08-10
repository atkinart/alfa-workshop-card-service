package ru.alfabank.workshop;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "apple-pay-service")
public interface ApplePayClient {

    @RequestMapping(value = "/cards/{userId}", method = RequestMethod.GET)
    Response getAppleCards(@PathVariable("userId") String userId);

}
