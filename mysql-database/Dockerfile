FROM mysql:5.7
ENV MYSQL_ROOT_PASSWORD=root
COPY ./init.sql /docker-entrypoint-initdb.d/
ENV LANG=C.UTF-8
CMD ["mysqld", "--character-set-server=utf8mb4", "--collation-server=utf8mb4_unicode_ci"]