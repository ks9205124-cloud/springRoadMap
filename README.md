# 🍃 Spring Framework Roadmap

My dedicated study vault and codebase tracking my journey through modern backend engineering with the Spring Framework.

## 📚 Progress Tracker

- **Chapter 2:** Adding Beans to the Spring Context (Discovering how to explicitly define application components using `@Bean` in configuration classes, leveraging stereotype annotations like `@Component` for automatic scanning via `@ComponentScan`, and programmatically registering beans dynamically at runtime).
- **Chapter 3:** Wiring and Dependency Injection (Establishing relationships between objects inside the Spring IoC container. Covering the trade-offs between field injection, setter injection, and modern production best-practices using constructor injection to enforce immutability).
- **Chapter 4:** Decoupling via Abstractions (Designing robust application contracts by programming to Java interfaces rather than concrete implementations. Utilizing dependency injection to dynamically swap out proxy and repository dependencies, effectively splitting distinct object responsibilities).
- **Chapter 5:** Bean Scopes and Lifecycle Mechanics (Contrasting Spring's default Singleton behavior—where a single shared instance is eagerly created at context startup—with the Prototype scope which forces a fresh instance generation on every request. Covered using `@Scope` to alter bean instantiation mechanics and leveraging `@Lazy` to defer initialization until the bean is explicitly requested at runtime).
- **Chapter 6:** Using Aspects with Spring AOP (Understanding aspect mechanics, implementing aspects with Around advice, intercepting annotated methods, and managing the aspect execution chain).
- **Chapter 7:** Implementing web apps with Spring Boot and Spring MVC (Transitioning to Spring Boot's convention-over-configuration, booting embedded servers, and understanding the `@SpringBootApplication` lifecycle).
- **Chapter 8:** Dynamic Views and Data Exchange (Injecting dynamic data into HTML templates using Thymeleaf; capturing client input via `@RequestParam` for query parameters and `@PathVariable` for URL path variables; handling HTTP GET/POST verbs).
- **Chapter 9:** Using Spring Web Scopes (Managing state across the web lifecycle: understanding Request, Session, and Application scopes to control bean visibility and lifecycle in a web context).
- **Chapter 10:** REST API Design and Exception Handling (Building RESTful endpoints using `@RestController` and HTTP verbs; controlling responses with `ResponseEntity` including custom status codes and headers; implementing global exception handling using `@RestControllerAdvice` and `@ExceptionHandler` to return structured error responses).
- **Chapter 11:** Consuming REST Endpoints (Calling external REST APIs from within a Spring app using `RestTemplate` and `WebClient`; leveraging Spring Cloud OpenFeign to define declarative HTTP clients as interfaces; sending and receiving custom headers using `@RequestHeader` and `ResponseEntity`).
- **Chapter 12:** Data Sources and JDBC (Connecting Spring Boot to a relational database using `DataSource` and `JdbcTemplate`; executing parameterized SQL queries for CRUD operations; mapping result sets to Java objects using `RowMapper`; configuring datasource properties via `application.properties` and switching from H2 in-memory to MySQL 8.0 for persistent storage).
## 🛠️ Tech Stack Baseline

- **Java Version:** 25 (LTS)
- **Build Tool:** Maven
- **Core Concepts & Annotations:** 
    - **Core:** `@Configuration`, `@Bean`, `@ComponentScan`, `@Component`, `@Service`, `@Repository`, `@Lazy`
    - **DI/Lifecycle:** `@Autowired`, `@Qualifier`, `@PostConstruct`, `@PreDestroy`, `@Scope`
    - **AOP:** `@Aspect`, `@Around`, `@EnableAspectJAutoProxy`
    - **Web MVC:** `@SpringBootApplication`, `@Controller`, `@RequestMapping`, `@GetMapping`, `@PostMapping`, `@RequestParam`, `@PathVariable`
    - **Web Scopes:** `@RequestScope`, `@SessionScope`, `@ApplicationScope`
    - **REST:** `@RestController`, `@ResponseBody`, `@ResponseStatus`, `@RestControllerAdvice`, `@ExceptionHandler`, `@RequestHeader`
    **Data:** `@Repository`, `JdbcTemplate`, `RowMapper`, `DataSource`
    - **Dependencies:** `spring-boot-starter-web`, `spring-boot-starter-thymeleaf`, `spring-cloud-starter-openfeign`,`mysql-connector-j`