def commonChars(strs):
  if len(strs) == 0:
    return []

  char_map = set(strs[0])

  for s in strs:
    new_char_map = set()
    for c in s:
      if c in char_map:
        new_char_map.add(c)
    char_map = new_char_map

  return list(char_map)


print(commonChars(['cook','loook']))