select id, email, first_name, last_name
from developer_infos
where (skill_1 like 'python') or (skill_2 like 'python') or (skill_3 like 'python')  
order by id;