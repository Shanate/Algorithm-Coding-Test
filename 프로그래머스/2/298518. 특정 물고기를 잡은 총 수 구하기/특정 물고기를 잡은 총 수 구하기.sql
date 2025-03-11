select count(*) as fish_count
from fish_info FI
join fish_name_info FNI
on FI.fish_type = FNI.fish_type
where FNI.fish_name in ('bass', 'snapper');