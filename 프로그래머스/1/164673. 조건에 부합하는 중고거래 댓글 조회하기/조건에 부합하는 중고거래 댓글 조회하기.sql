select B.TITLE, B.board_id as BOARD_ID, R.REPLY_ID, R.writer_id as WRITER_ID, R.contents as CONTENTS, date_format(R.created_date, '%Y-%m-%d') as CREATED_DATE
from used_goods_board B

join used_goods_reply R on B.board_id = R.board_id
where B.created_date like '2022-10%'
order by R.created_date asc, B.TITLE asc;