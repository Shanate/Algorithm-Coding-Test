select count(*) as COUNT
from ecoli_data
where (genotype&1=1 or genotype&4=4) and (genotype&2!=2)
