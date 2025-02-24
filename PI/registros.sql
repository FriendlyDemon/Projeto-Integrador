insert into
    drug_base (id, name, comsumption)
values
    (1, "omeprasol", "oral"),
    (2, "paracetamol", "oral"),
    (3, "dipirona", "oral");

insert into
    user (email, name, phone)
values
    (
        "user001@gmail.com",
        "user lastname",
        "(51) 99887-7665"
    );

insert into
    drug_ref (id, drug_id, quantity, expiry_date)
values
    (1, 1, 30, "2030-02-30"),
    (2, 2, 12, "2025-02-25"),
    (3, 3, 10, "2028-05-25");

insert into
    use (
        id,
        user_id,
        drug_id,
        quantity,
        interval,
        beginning,
        active
    )
values
    (1, 1, 1, 2, 24, "2024-01-01", true),
    (2, 1, 2, 1, 12, "2025-02-22", true),
    (3, 1, 3, 1, 24, "2025-02-24", false);
