# Java
******************************************************************************
/CONSUMER/...
REST клиент с сохранением информации в БД - на вход передаются ключ и текст, 
сервис возвращает список стран и города, + переданный текст.

Для запуска нужно создать таблицы/сиквенсы.
Скрипты для создания в /consumer/database/create_tables.sql

Hibernate config 
/consumer/src/main/resources/hibernate.cfg.xml
нужно прописать адрес БД, УЗ и пароль для подключения к базе:
<br>
<property name="connection.url">jdbc:postgresql://ip:port/dbName</property>
<property name="connection.username">@username</property>
<property name="connection.password">@password</property>
по-умолчанию - сконфигурировано для работы с PostgreSQL
******************************************************************************
