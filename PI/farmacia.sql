create table
    "user" (
        email varchar(100) unique primary key,
        name varchar(100),
        phone varchar(20)
    );

create table
    drug_base (
        id int unique primary key,
        name varchar(100),
        comsumption varchar(20)
    );

create table
    use (
        id int unique primary key,
        user_id varchar(100) references "user" (email),
        drug_id int references drug_base (id),
        quantity int,
        interval int,
        beginning date,
        active boolean
    );

create table
    drug_ref (
        id int unique primary key,
        drug_id int references drug_base (id),
        quantity int,
        expiry_date date
    );

create table
    history_drugs (
        id int unique primary key,
        user_id varchar(100) references "user" (email),
        drug_id int references drug_base (id),
        date_use date,
        taken boolean
    );