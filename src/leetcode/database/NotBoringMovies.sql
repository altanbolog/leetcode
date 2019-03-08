select c.id, c.movie, c.description, c.rating
from cinema c
where c.description != "boring"
  and c.id mod 2 = 1
order by rating desc