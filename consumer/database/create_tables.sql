/*
drop table  public.Country CASCADE;
drop table public.City CASCADE;
*/
CREATE SEQUENCE country_seq;
CREATE SEQUENCE city_seq;

CREATE TABLE public.Country(
    country_id int NOT NULL DEFAULT NEXTVAL ('country_seq'),
    country_name VARCHAR(100),
    country_ISO_Code VARCHAR(2),
    PRIMARY KEY (country_id)
);

CREATE TABLE public.City(
    city_id int NOT NULL DEFAULT NEXTVAL ('city_seq'),
    city_name VARCHAR(100),
    country_id int,
    PRIMARY KEY (city_id),
    CONSTRAINT country_fk FOREIGN KEY (country_id) REFERENCES public.Country (country_id)
);
