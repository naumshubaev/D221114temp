# Дипломный проект

## Документация
[План автоматизации тестирования](https://github.com/naumshubaev/D221114temp/blob/master/Plan.md)

[Итоги тестирования](https://github.com/naumshubaev/D221114temp/blob/master/Report.md)

[Итоги автоматизации](https://github.com/naumshubaev/D221114temp/blob/master/Summary.md)

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
4) остановить приложение и Докер
5) запуск под PostgreSQL:
* приложение
   ```
   java -Dspring.datasource.url=jdbc:postgresql://localhost:5432/app -jar artifacts/aqa-shop.jar
   ```
  * тесты
   ```
   gradlew -Ddb.url=jdbc:postgresql://localhost:5432/app clean test
   ```
6) отчеты в Allure создаются командой
   ```
   gradlew allureServe
   ```
   (если при первой попытке создания отчетов возникает ошибка "Cannot find allure commandline ...", то использовать команду gradlew downloadAllure, а затем gradlew allureServe)