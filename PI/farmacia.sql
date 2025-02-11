create table
    usuario (id serial primary key, nome varchar(100),);

create table
    remedio_base (id serial primary key, nome varchar(100),tipo_remedio varchar(20),);

create table
    uso (
        id serial primary key,
        usuario_id int references usuario (id),
        remedio_id int references remedio (id),
        intervalo date
    );

create table
    remedio_ref (
        id serial primary key,
        remedio_id int references remedio_base (id),
        quantidade int,
        validade date
    );

create table
    historico_remedios (
        id serial primary key,
        usuario_id int references usuario (id),
        remedio_id int references remedio_base (id),
        inicio date,
        fim date
    );

