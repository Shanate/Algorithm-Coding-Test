select I.item_id, I.item_name, I.rarity
from item_info I
join item_tree T
on I.item_id = T.item_id
where T.parent_item_id in (
select item_id
from item_info
where rarity in ('rare'))
order by I.item_id desc;