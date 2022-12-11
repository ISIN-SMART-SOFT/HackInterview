--  Создание базовой сущности 'Интервью'
CREATE TABLE interview
(
    id          BIGSERIAL                NOT NULL,
    title       VARCHAR(255)             NOT NULL,
    description VARCHAR(255)             NOT NULL,
    date_meet   TIMESTAMP WITH TIME ZONE NOT NULL,

    CONSTRAINT pk_interview PRIMARY KEY (id)
);