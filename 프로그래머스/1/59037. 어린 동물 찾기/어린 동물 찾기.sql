SELECT animal_id, name
from animal_ins
where not intake_condition in('aged')
order by animal_id;