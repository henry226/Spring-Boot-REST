insert into user_details(id, birth_date, name)
values (10001, current_date(), 'John');

insert into user_details(id, birth_date, name)
values (10002, current_date(), 'Smith');

insert into user_details(id, birth_date, name)
values (10003, current_date(), 'Doe');

insert into post(id, description, user_id)
values (20001, 'Learn Spring Boot', 10001);

insert into post(id, description, user_id)
values (20002, 'Learn AWS', 10002);

insert into post(id, description, user_id)
values (20003, 'Learn LeetCode', 10003);
