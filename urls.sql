DROP TABLE IF EXISTS urls;
CREATE TABLE urls (
	id INT(11) AUTO_INCREMENT PRIMARY KEY,
	url VARCHAR(255) NOT NULL,
	domainname VARCHAR(255) NOT NULL,
	category VARCHAR(255) NOT NULL
);
INSERT INTO urls (url, domainname, category) VALUES ('https://www.google.com', 'google', 'search')
	, ('https://www.youtube.com', 'youtube', 'entertainment')
	, ('https://www.facebook.com', 'facebook', 'social media')
	, ('https://en.wikipedia.org', 'wikipedia', 'learning')
	, ('https://www.khanacademy.org', 'khan academy', 'learning');
