select c.class class
from courses c
group by c.class
having count(DISTINCT c.student) > 4