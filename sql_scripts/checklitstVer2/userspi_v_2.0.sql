-- checklistDB ver 2.0


USE checklist;

SELECT * FROM checklist.userspi;

-- create users PI

CREATE TABLE IF NOT EXISTS userpi (
	user_id CHAR(36) DEFAULT (UUID()),
    dob DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS checklist (
	checklist_id CHAR(36) DEFAULT (UUID()),
    date_created DATE NOT NULL,
    user_id CHAR(36),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
    
);