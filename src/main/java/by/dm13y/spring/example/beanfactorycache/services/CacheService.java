package by.dm13y.spring.example.beanfactorycache.services;

/**
 * @author D.Dmitrievich
 */
public interface CacheService {
    void put(String key, String value);

    String get(String key);
}
