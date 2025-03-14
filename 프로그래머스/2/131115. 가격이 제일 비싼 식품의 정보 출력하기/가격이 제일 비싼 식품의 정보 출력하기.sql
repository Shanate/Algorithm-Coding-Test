SELECT *
FROM food_product
where price = (select max(price)
          from food_product);