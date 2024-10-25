## SPRING FRAMEWORK

This application is a basic User Management System
built using Spring Core without Spring Boot,
Spring MVC, and Spring Data JPA. It allows users to perform CRUD operations
such as creating, viewing, updating, and deleting users through a web interface.

## Table of Contents
- [Project Structure](#project-structure)
- [Dependency Injection (DI)](#dependency-injection-di)
- [Inversion of Control (IoC)](#inversion-of-control-ioc)
- [Spring Beans](#spring-beans)
- [Bean Scopes](#bean-scopes)
- [ApplicationContext](#applicationcontext)
- [Component Scanning and Stereotype Annotations](#component-scanning-and-stereotype-annotations)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation and Setup](#installation-and-setup)

### Project Structure
```sh
src/
├── main/
│   ├── java/
│   │   └── org/
│   │       └── Spring/
│   │           ├── controller/         # Contains controllers handling HTTP requests
│   │           ├── domain/             # Contains domain entities representing the data model
│   │           ├── repository/         # Contains repository interfaces for data access
│   │           ├── service/            # Contains services that provide business logic
│   │           └── Main                # Main class to run the application
│   ├── resources/
│   │   └── applicationContext.xml      # Spring context configuration file
│   └── webapp/
│       └── WEB-INF/
│           ├── views/                  # Contains JSP view files
│           ├── dispatcher-servlet.xml  # DispatcherServlet configuration file
│           └── web.xml                 # Web application deployment descriptor
```

### Dependency Injection (DI)
Is a concept for best practice in programming that allows a class to be decoupled from its dependencies. As also it is a design pattern that is used to implement IoC. In Spring, DI is implemented using constructor injection or setter injection or field injection but is not recommended.
### Inversion of Control (IoC)

### Spring Beans
a beans in spring is an object managed by spring framework

### Bean Scopes
-Singleton: create a single instance of the bean. It is the default scope.
-Prototype: create a new instance of the bean each time it is requested.

### ApplicationContext
it is a container that contains all the beans, it is responsible for instantiating, configuring, and assembling the beans.


### Component Scanning and Stereotype Annotations
@Component: generic stereotype for any Spring-managed component.<br>
@Repository: stereotype for persistence layer.<br>
@Service: stereotype for service layer.<br>
@Controller: stereotype for presentation layer (spring-mvc).<br>

### Spring Data JPA
Spring Data JPA is a part of the larger Spring Data project. It makes it easy to use JPA in Spring applications by providing a set of abstractions and utilities to reduce boilerplate code. It also provides a repository abstraction that allows us to work with JPA entities without writing boilerplate code.

### Spring MVC
It is a web framework that is built on top of the core Spring framework. It provides a model-view-controller architecture and ready-to-use components that can be used to build web applications.

### Installation and Setup
to install and set up the spring framework you need to add the spring dependencies in the pom.xml file and create the spring configuration file applicationContext.xml and dispatcher-servlet.xml and web.xml file in the webapp/WEB-INF/ directory.
