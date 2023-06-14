# Custom Spring Boot Starter

This is a custom starter for Spring Boot that provides HelloWorld additional functionality.

## Configuration

To use this starter, you can include the following dependency in your `pom.xml` file:

```xml
<dependency>
    <groupId>ru.fruits</groupId>
    <artifactId>custom-starter-demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

This starter provides some additional configuration options that you can use to customize its behavior.
You can configure these options in your application.yml file:

```yml
ru:
  fruits:
    name: "Some name to say hello"
```

## Usage

You can autowire starter bean to say hello:

```java
@Autowired
private StarterDemo demo;
```

Also you can apply annotation @ExecutionTime to log method execution time.
