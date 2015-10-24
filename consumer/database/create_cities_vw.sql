create or replace view public.cities_vw as
  select city_name as City, country_name as Country, country_iso_code as "Country [ISO]" from city c left join country cc on cc.country_id=c.country_id;
