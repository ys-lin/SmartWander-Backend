## To start the db
`sudo systemctl start postgresql@16-main`
replace `16` with the number you get from running `ls /etc/postgresql/` 
If you get a password authentication failure warning, run `sudo -u postgres psql -c "ALTER USER postgres WITH PASSWORD 'postgres';"`

## To start the application
`mvn spring-boot:run`


