DROP SEQUENCE IF EXISTS "author_id_seq";
CREATE SEQUENCE "author_id_seq" INCREMENT BY 50 START 1;

DROP TABLE IF EXISTS "author";
DROP TABLE IF EXISTS "books";

CREATE TABLE "authors"
(
    id          BIGINT  NOT NULL,
    name        VARCHAR(255),
    age         INTEGER NOT NULL,
    description VARCHAR(255),
    CONSTRAINT "authors_pkey" PRIMARY KEY ("id")
);

CREATE TABLE "books"
(
    isbn        VARCHAR(19) NOT NULL,
    title       VARCHAR(255),
    description VARCHAR(255),
    image       VARCHAR(255),
    author_id   BIGINT,
    CONSTRAINT "books_pkey" PRIMARY KEY ("isbn")
);
