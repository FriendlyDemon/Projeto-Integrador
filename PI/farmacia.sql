create table
    usuario (
        id serial primary key,
        nome varchar(100),
        telefone varchar(20),
        email varchar(100)
    );

create table
    remedio_base (
        id serial primary key,
        nome varchar(100),
        tarja varchar(20),
        via_consumo varchar(20)
    );

create table
    uso (
        id serial primary key,
        usuario_id int references usuario (id),
        remedio_id int references remedio_base (id),
        quantidade int,
        intervalo int
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
        data_uso date,
        tomado boolean
    );