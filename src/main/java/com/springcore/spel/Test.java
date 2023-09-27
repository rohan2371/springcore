package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel-config.xml");
        Demo d1 = (Demo) context.getBean("demo");
        System.out.println(d1);

        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();

        Expression expression = spelExpressionParser.parseExpression("34+35");
        System.out.println(expression.getValue());
    }
}
