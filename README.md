# Дипломный проект

D221204


0) Все пароли я положил в репозиторий - мы делали так в дз, будем считать, что и для диплома это допустимо. Но интересно Ваше мнение, как лучше и обязательно ли прятать пароли в рамках дипломного проекта (в конфигурацию тестов например, чтобы они локально хранились?)

1) TODO: Баг-репорты

2) TODO: Тесты БД - отладка (баги у меня в тестах, не в SUT)

## Запуск контейнеров, приложения и тестов
0) утановить IntellijIdea и Docker 
1) склонировать данный репозиторий
2) запуск контейнеров с MySql, PostgreSQL и Node.js использовать команду

``` docker-compose up -d --build ```
4) запуск приложения:
    * для запуска под MySQL:
    ```
    java -Dspring.datasource.url=jdbc:mysql://localhost:3306/app -jar artifacts/aqa-shop.jar
    ```
    * для запуска под PostgreSQL:
    ```
    java -Dspring.datasource.url=jdbc:postgresql://localhost:5432/app -jar artifacts/aqa-shop.jar
    ```
5) запуск тестов:
    * для запуска под MySQL:
   ```
   gradlew -Ddb.url=jdbc:mysql://localhost:3306/app clean test
   
   ```
    * для запуска под PostgreSQL:
   ```
   gradlew -Ddb.url=jdbc:postgresql://localhost:5432/app clean test