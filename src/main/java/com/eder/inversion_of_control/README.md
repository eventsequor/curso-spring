# Inversion of control

In this section we use the inversion of control to start an instance
to this is necessary to create a general interface and inheritance classes that allow implement the model
the next to topics are important to declare the inversion of control


## 1. Xml config file

In the resource root path you have to create a xml file an example of the name could be:
**applicationContext.xml**


``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="
    http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.1.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context-3.1.xsd
">
    <bean id="myEmployee" class="com.eder.inversion_of_control.SecretaryEmployee">

    </bean>
</beans>
```

into the bean element on the xml you have to declare the id and class to point to the specify object

``` xml
 <bean id="myEmployee" class="com.eder.inversion_of_control.SecretaryEmployee"></bean>
```

## How to instance and handle the context 

For instance a class you have to use a context the next example show how to perform it

``` java
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
String idOfBean = "myEmployee";
Employees juan = context.getBean(idOfBean, Employees.class);
System.out.println(juan.getTasks());
context.close();
```