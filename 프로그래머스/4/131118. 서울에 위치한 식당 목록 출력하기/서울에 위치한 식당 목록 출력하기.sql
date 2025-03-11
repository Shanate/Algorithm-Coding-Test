SELECT I.rest_id, I.rest_name, I.food_type, I.favorites, I.address, round(avg(R.review_score), 2) as score
from rest_info I
inner join rest_review R
on I.rest_id = r.rest_id
where I.address like '서울%'
group by rest_id
order by 6 desc, 4 desc;