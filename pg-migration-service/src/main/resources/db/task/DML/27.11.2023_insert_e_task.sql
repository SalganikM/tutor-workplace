--liquibase formatted sql

--changeset 27.11.2023-Salganik:insert_e_task#0001
INSERT INTO e_task (id, name, entity_type, description, created, modified, update_author, condition) VALUES
    (1, 'test task 1', 'test task', 'задача для теста в рамках разработки', now(), now(), 'salganik', 'тестовое условие 1'),
    (2, 'test task 2', 'test task', 'задача для теста в рамках разработки', now(), now(), 'salganik', 'тестовое условие 2');
