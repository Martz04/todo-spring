drop table if exists Todo;
create table Todo
(
    id serial primary key,
    title varchar(100) not null,
    description varchar(255),
    completed integer
);