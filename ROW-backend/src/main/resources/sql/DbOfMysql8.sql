CREATE TABLE IF NOT EXISTS `d_row`.t_user
(
    id       BIGINT      NOT NULL,
    username varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    `deleted`      tinyint(1)  NOT NULL,
    `create_time`  datetime    NOT NULL,
    `update_time`  datetime    NOT NULL,
    CONSTRAINT t_user_pk PRIMARY KEY (id),
    CONSTRAINT t_user_unique UNIQUE KEY (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
