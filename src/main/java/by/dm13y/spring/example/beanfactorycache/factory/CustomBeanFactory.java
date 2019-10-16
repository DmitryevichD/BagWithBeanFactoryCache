package by.dm13y.spring.example.beanfactorycache.factory;

import by.dm13y.spring.example.beanfactorycache.entity.CustomBean;
import by.dm13y.spring.example.beanfactorycache.services.CacheChecker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomBeanFactory extends AbstractFactoryBean<CustomBean> {
    private final CacheChecker comeConverter;

    @Override
    public Class<?> getObjectType() {
        return CustomBean.class;
    }

    @Override
    protected CustomBean createInstance() throws Exception {
        comeConverter.check();
        return new CustomBean();
    }
}
