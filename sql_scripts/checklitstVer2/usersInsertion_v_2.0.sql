-- checklistDB ver 2.0


use checklist;

select * from users;

-- query to get users using first name
select * from users where first_name='peter';


INSERT INTO users (first_name, last_name, email) VALUES

('Hannah', 'Allen', 'hannah.allen@example.com'),
('Lillian', 'Sanchez', 'lillian.sanchez@example.com'),
('Alyssa', 'Wright', 'alyssa.wright@example.com'),
('Natalie', 'King', 'natalie.king@example.com'),
('Addison', 'Scott', 'addison.scott@example.com');
----------------------------------------------------------
