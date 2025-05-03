example = list(map(int, input().split()))

is_asc_sorted = (sorted(example) == example)
is_dec_sorted = (sorted(example, reverse=True) == example)

if is_asc_sorted:
    print("ascending")
elif is_dec_sorted:
    print("descending")
else:
    print("mixed")