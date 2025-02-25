CREATE TABLE expenses (
    id SERIAL PRIMARY KEY,
    category VARCHAR(255) NOT NULL,
    amount DECIMAL NOT NULL,
    date VARCHAR(50) NOT NULL
);