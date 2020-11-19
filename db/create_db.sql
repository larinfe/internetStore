--  Создание БД
CREATE DATABASE fedos_db WITH ENCODING = 'UTF8';
CREATE USER fedos_db_user WITH PASSWORD 'password';
GRANT ALL ON DATABASE fedos_db TO fedos_db_user;