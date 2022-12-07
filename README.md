# Дипломный проект

D221204


0) Все пароли я положил в репозиторий - мы делали так в дз, будем считать, что и для диплома это допустимо. Но интересно Ваше мнение, как лучше и обязательно ли прятать пароли в рамках дипломного проекта (в конфигурацию тестов например, чтобы они локально хранились?)

1) TODO: Баг-репорты

2) TODO: Тесты БД - отладка (баги у меня в тестах, не в SUT)

## Запуск контейнеров, приложения и тестов
0) утановить IntellijIdea и Docker 
1) склонировать данный репозиторий
2) запуск контейнеров с MySql, PostgreSQL и Node.js

   ``` docker-compose up -d --build ```
3) запуск под MySQL:
* приложение
   ```
   java -Dspring.datasource.url=jdbc:mysql://localhost:3306/app -jar artifacts/aqa-shop.jar
   ```
* тесты
   ```
   gradlew -Ddb.url=jdbc:mysql://localhost:3306/app clean test   
   ```
4) остановить приложение и Докер!
5) запуск под PostgreSQL:
* приложение
   ```
   java -Dspring.datasource.url=jdbc:postgresql://localhost:5432/app -jar artifacts/aqa-shop.jar
   ```
  * тесты
   ```
   gradlew -Ddb.url=jdbc:postgresql://localhost:5432/app clean test
   ```