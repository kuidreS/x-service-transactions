CREATE TABLE users
(
  id bigint NOT NULL,
  birthday date,
  email character varying(255),
  first_name character varying(255),
  last_name character varying(255),
  CONSTRAINT users_pkey PRIMARY KEY (id)
)