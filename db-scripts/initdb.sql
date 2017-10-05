create table users (
    id int not null,
    first_name varchar(255) default null,
    last_name varchar(255) default null,
    phone varchar(20) not null,
    city varchar(255) not null,
    primary key (id)
);