def filter_list(l):
  'return a new list with the strings filtered out'
  l = [x for x in l if isinstance(x,int)]
  return l