# 🍃 Spring Framework Roadmap

My dedicated study vault and codebase tracking my journey through modern backend engineering with the Spring Framework.

## 📚 Progress Tracker
* **Chapter 2:** Adding Beans to the Spring Context (Discovering how to explicitly define application components using `@Bean` in configuration classes, leveraging stereotype annotations like `@Component` for automatic scanning via `@ComponentScan`, and programmatically registering beans dynamically at runtime).
* **Chapter 3:** Wiring and Dependency Injection (Establishing relationships between objects inside the Spring IoC container. Covering the trade-offs between field injection, setter injection, and modern production best-practices using constructor injection to enforce immutability).
* **Chapter 4:** Decoupling via Abstractions (Designing robust application contracts by programming to Java interfaces rather than concrete implementations. Utilizing dependency injection to dynamically swap out proxy and repository dependencies, effectively splitting distinct object responsibilities).
* **Chapter 5:** Bean Scopes and Lifecycle Mechanics (Contrasting Spring's default **Singleton** behavior—where a single shared instance is eagerly created at context startup—with the **Prototype** scope which forces a fresh instance generation on every request. Covered using `@Scope` to alter bean instantiation mechanics and leveraging `@Lazy` to defer initialization until the bean is explicitly requested at runtime).

## 📖 Books Used
* **Spring Start Here: Learn what you need and learn it well** by *Laurențiu Spilcă* (Manning Publications) — Main guide for mastering the Spring context, wiring configurations, and core framework lifecycle principles.

## 🛠️ Tech Stack Baseline
- **Java Version:** 25 (LTS)
- **Build Tool:** Maven
- **Core Concepts Covered:** `@Configuration`, `@Bean`, `@ComponentScan`, `@Component`, `@PostConstruct`, `@Primary`, `@PreDestroy`, `@Autowired`, `@Qualifier`, `@Service`, `@Repository`, `@Scope`, `@Lazy`
