CREATE TABLE USERS(
    id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    email varchar NOT NULL UNIQUE,
    password varchar NOT NULL,
    firstname varchar NOT NULL,
    lastname varchar NOT NULL,
    patronymic varchar,
    creation_time timestamp not null default
);
