create table if not exists note (
    id bigserial primary key,
    title varchar(200),
    content text,
    access varchar(30) check (access in ('PUBLIC', 'PRIVATE'))
);