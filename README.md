# Система Управления Учебным Процессом

Этот проект включает в себя разработку информационной системы для управления учебным процессом в общеобразовательных
учреждениях.
Система предназначена для автоматизации рутинных задач учителей, учеников и администрации школы, обеспечивая эффективное
планирование, отслеживание и управление учебным процессом.

## Описание

Данный проект представляет собой комплексную информационную систему, предназначенную для управления учебным процессом в
общеобразовательных учреждениях. Основная цель системы - максимальная автоматизация и оптимизация всех аспектов учебного
процесса, начиная от расписания занятий и заканчивая индивидуальным отслеживанием успеваемости каждого ученика.

### Основные функции:

Управление Расписанием: Автоматизированное составление расписания занятий, удобное внесение изменений и уведомление об
этих изменениях учащихся и преподавателей.

Электронный Журнал: Цифровая запись успеваемости и посещаемости учеников, включая функциональность для записи оценок и
замечаний.

Коммуникационные Инструменты: Обмен сообщениями между учителями, учениками и родителями, форумы и доски объявлений для
общих уведомлений и дискуссий.

Система Тестирования и Оценки: Инструменты для создания и проведения онлайн-тестов и экзаменов, автоматизация процесса
оценки и предоставление обратной связи.

Административные Функции: Управление учетными записями пользователей, отчеты и аналитика для администрации школы.

Персонализация и Настройка: Возможность индивидуальной настройки интерфейса и функциональности системы в соответствии с
предпочтениями пользователей.

### Цели проекта:

Повышение эффективности управления учебным процессом.
Улучшение коммуникации между учениками, учителями и родителями.
Оптимизация планирования и проведения учебных занятий.
Автоматизация рутинных процедур, связанных с оценками и посещаемостью.
Обеспечение удобного доступа к учебным ресурсам и материалам.
Потенциальная аудитория:
Учителя и преподаватели общеобразовательных учреждений.
Ученики и их родители.
Административный персонал школ.
Разработчики учебных программ и курсов.
Система разработана с учетом потребностей современного образовательного процесса и нацелена на обеспечение гибкости,
доступности и эффективности обучения.

## Начало работы

Эти инструкции помогут вам запустить копию проекта на вашей локальной машине для разработки и тестирования. Смотрите
раздел 'Развертывание' для информации о том, как развернуть проект в рабочей среде.

### Предварительные условия

Перед началом работы с проектом убедитесь, что на вашем компьютере установлены следующие программы и инструменты:

1. **Java Development Kit (JDK):** Убедитесь, что у вас установлен JDK не ниже версии 21. Вы можете скачать его
   с [официального сайта Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) или использовать
   OpenJDK.

2. **Maven:** Система управления проектами и сборки. Maven можно скачать и установить
   с [официального сайта](https://maven.apache.org/download.cgi).

3. **СУБД (например, PostgreSQL):** Убедитесь, что у вас установлена и настроена база данных, с которой будет
   работать приложение.

4. **Git:** Для клонирования репозитория и управления версиями. Скачайте Git
   с [официального сайта](https://git-scm.com/downloads).

### Установка

Пошаговый процесс установки и настройки проекта:

1. **Клонирование репозитория:**
   Откройте терминал и выполните команду клонирования репозитория:
   ```bash
   git clone https://github.com/Juergen-J/e-school-kr

## Запуск тестов

В этом разделе описывается, как запустить автоматизированные тесты для проверки работоспособности системы.

### Запуск юнит-тестов

Юнит-тесты предназначены для проверки отдельных компонентов приложения. Для их запуска выполните следующую команду:

```bash
mvn test 
```

## Развертывание

В этом разделе описывается процесс развертывания проекта с использованием Docker и docker-compose. Проект состоит из
нескольких сервисов: приложения (app), базы данных (db) и инструмента для управления базой данных (adminer).

### Предварительные требования

Убедитесь, что на вашей машине установлены следующие инструменты:

Docker

Docker Compose

### Шаги для развертывания

```bash
docker-compose up --build
```

Ключ --build гарантирует, что Docker будет пересобирать образы, если они были изменены. После запуска команды Docker
соберет и запустит все необходимые контейнеры в соответствии с конфигурацией docker-compose.yml.

### Доступ к приложению:

После успешного запуска контейнеров приложение будет доступно по адресу http://localhost:8080.

### Доступ к Adminer:

Adminer, инструмент для управления базой данных, будет доступен по адресу http://localhost:8081. Вы можете использовать
его для управления вашей базой данных PostgreSQL.

### Остановка и удаление контейнеров:

Чтобы остановить и удалить все контейнеры, используйте команду:

```bash
docker-compose down
```

Эта команда остановит все запущенные в рамках docker-compose контейнеры и удалит их.

### Важные замечания

Все данные, сохраненные в контейнере базы данных, будут утеряны при удалении контейнера, если только они не сохранены в
volume. В данной конфигурации используется volume postgres_data для сохранения данных базы данных.
Проверьте файлы конфигурации приложения и убедитесь, что они корректно настроены для работы с Docker и docker-compose.
Для развертывания в рабочей среде может потребоваться дополнительная настройка безопасности и производительности.

## Создано с помощью

* [Spring](https://spring.io/) - Используемый веб-фреймворк
* [Maven](https://maven.apache.org/) - Менеджер зависимостей
* [PostgreSQL](https://) - Используемая база данных
* [Thymeleaf](https://www.thymeleaf.org/) - Используемый шаблонизатор

## Авторы

* **Береговой Ю.Н.** - [GitHub](https://github.com/Juergen-J)