CREATE database checklist;

USE checklist;

select * from users;

CREATE TABLE IF NOT EXISTS users (
    user_id CHAR(36) DEFAULT (UUID()),
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE IF NOT EXISTS checklist (
	checklist_id CHAR(36) DEFAULT (UUID()),
    date_created DATE NOT NULL,
    user_id CHAR(36),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
    
);

CREATE TABLE IF NOT EXISTS tasks (
	task_id CHAR(36) DEFAULT (UUID()),
    checklist_id CHAR(36),
    name VARCHAR(50) NOT NULL,
    date_created DATE NOT NULL,
    description VARCHAR(100),
    status BOOLEAN NOT NULL DEFAULT false,
    FOREIGN KEY (checklist_id) REFERENCES checklist(checklist_id)
    
);

-- to set PK for tasks
ALTER TABLE tasks
ADD CONSTRAINT pk_task_id
PRIMARY KEY (task_id);

-- to set FK task to checklist
ALTER TABLE tasks
ADD CONSTRAINT fk_checklist
FOREIGN KEY (checklist_id)
REFERENCES checklist(checklist_id);


ALTER TABLE tasks
MODIFY COLUMN checklist_id CHAR(36) DEFAULT (UUID());



SELECT * FROM users;

ALTER TABLE checklist
MODIFY COLUMN checklist_id CHAR(36) PRIMARY KEY;

ALTER TABLE tasks
MODIFY COLUMN task_id CHAR(36) PRIMARY KEY;

ALTER TABLE checklist
ADD COLUMN checklist_name VARCHAR(50) NOT NULL;

USE checklist;

-- Insert random data into the users table
INSERT INTO users (user_id, first_name, last_name, email)
VALUES
    (UUID(), 'John', 'Doe', 'john.doe@example.com'),
    (UUID(), 'Jane', 'Smith', 'jane.smith@example.com'),
    (UUID(), 'Alice', 'Johnson', 'alice.johnson@example.com'),
    (UUID(), 'Bob', 'Williams', 'bob.williams@example.com'),
    (UUID(), 'Eva', 'Jones', 'eva.jones@example.com'),
    (UUID(), 'Michael', 'Davis', 'michael.davis@example.com'),
    (UUID(), 'Sophia', 'Taylor', 'sophia.taylor@example.com'),
    (UUID(), 'David', 'Brown', 'david.brown@example.com'),
    (UUID(), 'Emma', 'Moore', 'emma.moore@example.com'),
    (UUID(), 'Daniel', 'Anderson', 'daniel.anderson@example.com');
