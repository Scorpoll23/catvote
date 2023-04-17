CREATE TABLE cat (
  id INT PRIMARY KEY,
  name VARCHAR(255),
  photo VARCHAR(255),
  elo_rating INT
);

CREATE TABLE vote (
  id INT PRIMARY KEY,
  cat_id_1 INT,
  cat_id_2 INT,
  winner_id INT,
  loser_id INT,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
