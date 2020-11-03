--  Создание БД
CREATE DATABASE is_db WITH ENCODING = 'UTF8';
CREATE USER is_db_user WITH PASSWORD 'password';
GRANT ALL ON DATABASE is_db TO postgres;