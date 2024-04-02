# java-logging-learning

java 日志框架学习项目

## logback-learning

logback 日志框架的学习项目

### 文件结构

```
.
├── logback-learning
    └── src
        ├── logs  #项目日志文件所在目录
        └── main
            ├── java
            │   └── com
            │       └── learn
            │           ├── TestLogback01.java # Logback 的 quick start
            │           ├── TestLogback02.java # Logback 的 logback.xml 文件配置
            │           ├── TestLogback03.java # Logback 使用自定义日志记录器
            │           ├── TestLogback04.java # Logback 输出日志到文件中
            │           ├── TestLogback05.java # Logback 日志文件的拆分和压缩
            │           ├── TestLogback06.java # Logback 日志拦截器
            │           ├── TestLogback07.java # Logback 异步日志记录  
            │           ├── TestLogback08.java # Logback 代码配置日志记录器
            │           ├── TestLogback09.java # Logback 指定配置文件读取配置
            │           ├── TestLogback10.java # Logback 编程式配置-spi 机制
            │           ├── TestLogback11.java # 企业级日志打印指南（各日志级别使用含义）
            │           ├── TestLogback12.java # 日志打印和异常捕获的规范示例
            │           └── configuration
            │               └── MyConfiguration.java # spi 机制：ch.qos.logback.classic.spi.Configurator 接口的实现类
            │
            └── resources
                ├── logback02.xml
                ├── logback03.xml
                ├── logback04.xml
                ├── logback05.xml
                ├── logback06.xml
                ├── logback07.xml
                └── META-INF                                        # spi 机制：目录
                    └── services                                    # spi 机制：目录
                        └── ch.qos.logback.classic.spi.Configurator # spi 机制：文件中填入 MyConfiguration.java 类的全限定名
```

src/main/resources/META-INF/services/ch.qos.logback.classic.spi.Configurator 文件内容
```
com.learn.configuration.MyConfiguration
```

- 不同的 TestLogback0X.java 对应 logback0X.xml 配置文件, 
  执行对应 TestLogback0X.java 时，要将对应的 logback0X.xml 修改为 logback.xml。

## springboot-logging-learning

Springboot 使用 logback 日志框架打印日志

- Springboot 默认的内置日志框架是 logback。
- Springboot 默认使用 slf4j 作为日志门面，logback 作为日志实现来记录日志。

### 文件结构

```
.
└── springboot-logging-learning
    └── src
        ├── logs        # 项目日志文件所在目录
        ├── main
        │   ├── java
        │   │   └── com
        │   │       └── learn
        │   │           └── HelloApplication.java  # Springboot 项目的启动类
        │   └── resources
        │       ├── application02.properties
        │       ├── application03.properties
        │       ├── application04.properties
        │       ├── logback05.xml
        │       └── logback-spring06.xml
        └── test
            └── java
                └── com
                    └── learn
                        ├── TestSpringbootLogApplication01.java # Springboot 日志 quick start
                        ├── TestSpringbootLogApplication02.java # Springboot 日志之配置自定义日志记录器的日志级别
                        ├── TestSpringbootLogApplication03.java # Springboot 日志之配置日志记录输出格式
                        ├── TestSpringbootLogApplication04.java # Springboot 日志之输出日志到日志文件
                        ├── TestSpringbootLogApplication05.java # Springboot 日志之使用 logback.xml 配置文件进行详细配置
                        └── TestSpringbootLogApplication06.java # Springboot 日志之使用 logback-spring.xml 配置文件进行配置

```
- TestSpringbootLogApplication0X.java 程序对应不同的 application0X.properties 配置文件配置。

