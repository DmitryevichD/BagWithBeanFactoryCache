package by.dm13y.spring.example.beanfactorycache.cache;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
@CacheConfig(cacheNames = "correct")
public class CorrectCache {
    @Cacheable(unless = "#result == null")
    public String get(String value) {
        return null;
    }

    @CachePut(key = "#key")
    public Object put(String key, Object value) {
        return value;
    }
}
