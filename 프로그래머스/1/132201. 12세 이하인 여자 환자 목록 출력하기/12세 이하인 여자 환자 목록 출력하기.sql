SELECT PT_NAME, PT_NO, GEND_CD, AGE, ifnull(tlno, 'NONE') as TLNO
FROM patient
where age <= 12 and gend_cd = 'W'
order by age desc, pt_name;