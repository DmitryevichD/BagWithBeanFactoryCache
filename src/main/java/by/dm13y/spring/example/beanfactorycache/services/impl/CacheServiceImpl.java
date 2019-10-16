package by.dm13y.spring.example.beanfactorycache.services.impl;

import by.dm13y.spring.example.beanfactorycache.cache.IncorrectCache;
import by.dm13y.spring.example.beanfactorycache.services.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CacheServiceImpl implements CacheService {
    private final IncorrectCache incorrectCache;

    @Override
    public void put(String key, String value) {
        incorrectCache.put(key, value);
    }

    @Override
    public String get(String key) {
        return incorrectCache.get(key);
    }
}
