#minion work assignment solution


def solution(data, n):
    count_dict = {}
    for num in data:
        if num in count_dict:
            count_dict[num] += 1
        else:
            count_dict[num] = 1
    
    filtered_data = []
    for num in data:
        if count_dict[num] <= n:
            filtered_data.append(num)
    
    return filtered_data
