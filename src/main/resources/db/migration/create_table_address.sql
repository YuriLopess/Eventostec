CREATE TABLE address (
    id UUID gen_random_uuid() PRIMARY KEY,
    city VARCHAR(200) NOT NULL,
    uf VARCHAR(200) NOT NULL,
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);