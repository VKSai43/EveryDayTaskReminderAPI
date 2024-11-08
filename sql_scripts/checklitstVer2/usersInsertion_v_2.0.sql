-- checklistDB ver 2.0


use checklist;

select * from users;

-- query to get users using first name
select * from users where first_name='peter';

INSERT INTO users (first_name, last_name, email) VALUES
('peter', 'joy', 'joy.m@example.com');

INSERT INTO users (first_name, last_name, email) VALUES
('peter', 'joy', 'joy.m@example.com'),
('Emma', 'Johnson', 'emma.johnson@example.com'),
('Noah', 'Williams', 'noah.williams@example.com'),
('Olivia', 'Jones', 'olivia.jones@example.com'),
('Ava', 'Brown', 'ava.brown@example.com'),
('Isabella', 'Davis', 'isabella.davis@example.com'),
('Sophia', 'Miller', 'sophia.miller@example.com'),
('Mia', 'Wilson', 'mia.wilson@example.com'),
('Charlotte', 'Moore', 'charlotte.moore@example.com'),
('Amelia', 'Taylor', 'amelia.taylor@example.com'),
('Evelyn', 'Anderson', 'evelyn.anderson@example.com'),
('Harper', 'Thomas', 'harper.thomas@example.com'),
('Abigail', 'Jackson', 'abigail.jackson@example.com'),
('Ella', 'White', 'ella.white@example.com'),
('Scarlett', 'Harris', 'scarlett.harris@example.com'),
('Grace', 'Martin', 'grace.martin@example.com'),
('Chloe', 'Thompson', 'chloe.thompson@example.com'),
('Layla', 'Garcia', 'layla.garcia@example.com'),
('Sofia', 'Martinez', 'sofia.martinez@example.com'),
('Aria', 'Robinson', 'aria.robinson@example.com'),
('Zoe', 'Clark', 'zoe.clark@example.com'),
('Riley', 'Rodriguez', 'riley.rodriguez@example.com'),
('Aubrey', 'Lewis', 'aubrey.lewis@example.com'),
('Nora', 'Lee', 'nora.lee@example.com'),
('Lily', 'Walker', 'lily.walker@example.com'),
('Ellie', 'Hall', 'ellie.hall@example.com'),
('Maddison', 'Young', 'maddison.young@example.com'),
('Hannah', 'Allen', 'hannah.allen@example.com'),
('Lillian', 'Sanchez', 'lillian.sanchez@example.com'),
('Alyssa', 'Wright', 'alyssa.wright@example.com'),
('Natalie', 'King', 'natalie.king@example.com'),
('Addison', 'Scott', 'addison.scott@example.com');
