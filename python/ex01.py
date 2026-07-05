nums = [1, 2, 3, 4]

result = list(map(lambda x: x * 2 if x % 2 == 0 else x + 1, nums))

print(result)