# spring-framework
Spring training from PluralSight learning path

## Bean scopes
1. Singleton
2. Prototype
3. Request
4. Session
5. Application

##Stereotypes
1. @Component - Same as @Bean annotation. @Bean annotation is allowed at method level only while @Component annotation is applied at class level.
2. @Repository - Used to denote a class which is a repository
3. @Service - Used to denote class with business logic
4. @Controller - 

Autowire
1. By type
2. By name
3. By constructor
4. None

Bean life cycle
1. Instantiation
2. Populate properties
3. BeanNameAware - sets bean name and makes it aware of other resources
4. BeanFactoryAwareContext
5. Pre Initialize - BeanPostProcessors
6. initMethod
7. Post initialization - BeanPostProcessors

@PostConstruct - A private method with this annotation, in class managed by spring, is called after constructor of the class.