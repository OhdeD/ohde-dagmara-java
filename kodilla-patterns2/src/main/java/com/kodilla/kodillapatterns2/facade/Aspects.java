package com.kodilla.kodillapatterns2.facade;

import com.kodilla.kodillapatterns2.facade.api.OrderDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspects {
    private static final Logger LOGGER = LoggerFactory.getLogger(Aspects.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(order, userId) && target(o)")
    public void logEvent(OrderDto order, Long userId, Object o) {
        LOGGER.info("Class: " + o.getClass().getName() + " started processOrder() method for UserId: " + userId);
    }

    @Around("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long start = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time of proceeding method: " + (end - start));
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }

}
