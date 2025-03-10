SELECT book_id, date_format(published_date, '%Y-%m-%d') as published_date
FROM book
WHERE published_date like '2021%' and category in ("인문")
order by published_date;