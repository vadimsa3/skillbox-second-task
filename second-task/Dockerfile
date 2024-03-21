# базовый образ, содержащий Java 17
FROM openjdk:17-oracle

# рабочая директория приложения внутри контейнера
WORKDIR /app

# копирование JAR-файла (созданого gradle/build/bootJar) приложения в контейнер и переименование его
COPY build/libs/skillbox-second-task-0.0.1-SNAPSHOT.jar app.jar

# определение переменной среды, по умолчанию будет запуск со свойством из properties - true
ENV CREATE_ON_STARTUP=true

# команда для запуска приложения
CMD ["java", "-jar", "app.jar"]