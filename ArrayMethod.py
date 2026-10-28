def reversed_number(number):
    result = []
    for row in number:
        result.append(row[::-1])
    return result
    
number = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

print (reversed_number(number))    












