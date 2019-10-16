package by.dm13y.spring.example.beanfactorycache.services;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CacheChecker {
    private static final String SOME_KEY = "redisKey";
    private final CacheService cacheService;

    public String check() {
        cacheService.put(SOME_KEY, "value");
        val result = cacheService.get(SOME_KEY);
        return Optional.ofNullable(result)
                .orElseThrow(NullPointerException::new);
    }
}
