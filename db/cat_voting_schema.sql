CREATE TABLE cat (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255),
  photo_url VARCHAR(255),
  elo_rating INT,
  PRIMARY KEY (id)
);

CREATE TABLE vote (
  id INT PRIMARY KEY,
  winner_id INT,
  loser_id INT,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (winner_id) REFERENCES cat(id),
  FOREIGN KEY (loser_id) REFERENCES cat(id)
);
