--liquibase formatted sql

--changeset 26.11.2023-Salganik:create_e_solution#0001
CREATE TABLE e_solution(
   id BIGINT PRIMARY KEY,
   name VARCHAR(128),
   entity_type VARCHAR(128),
   description TEXT,
   created TIMESTAMP,
   modified TIMESTAMP,
   update_author VARCHAR(40),
   meta_info VARCHAR(128),

   task_id BIGINT,
   solution TEXT,
   solution_file_hash VARCHAR(40),
   solution_file_path VARCHAR
);