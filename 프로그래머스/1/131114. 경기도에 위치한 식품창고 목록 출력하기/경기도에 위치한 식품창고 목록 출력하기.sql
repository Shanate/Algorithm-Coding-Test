SELECT warehouse_id, warehouse_name, address, ifnull(freezer_yn, 'N') as freezer_yn
FROM food_warehouse
where address like '%경기%'
order by warehouse_id asc;