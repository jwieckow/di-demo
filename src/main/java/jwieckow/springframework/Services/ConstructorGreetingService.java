package jwieckow.springframework.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I Was injected via Constructor";
    }
}
